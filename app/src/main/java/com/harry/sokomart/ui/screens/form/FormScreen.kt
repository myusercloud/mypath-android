package com.harry.sokomart.ui.screens.form

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.harry.sokomart.R
import com.harry.sokomart.ui.theme.blue
import com.harry.sokomart.ui.theme.mytheme

@Composable
fun FormScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "home",
            modifier = Modifier.size(250.dp),
        )
        Text(
            text = "Sign Up",
            fontSize = 50.sp,
            color = mytheme
        )
        Spacer(modifier = Modifier.height(10.dp))

        //variables
        var fullname by remember { mutableStateOf("") }
        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        //fullname
        OutlinedTextField(
            value = fullname,
            onValueChange = { fullname = it },
            modifier = Modifier.fillMaxWidth().padding(start = 15.dp, end = 15.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "",
                    tint = mytheme,
                )
                          },
            label = {
                Text(
                    text = "Full Name"
                )
                    },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = blue,
                unfocusedBorderColor = mytheme,
                focusedLabelColor = blue,
                unfocusedLabelColor = mytheme,
                cursorColor = blue
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        //end of fullname
        //username
        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            modifier = Modifier.fillMaxWidth().padding(start = 15.dp, end = 15.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Face,
                    contentDescription = "",
                    tint = mytheme,
                )
            },
            label = {Text(text = "Username")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = blue,
                unfocusedBorderColor = mytheme,
                focusedLabelColor = blue,
                unfocusedLabelColor = mytheme,
                cursorColor = blue
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        //end of username
        //email
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier.fillMaxWidth().padding(start = 15.dp, end = 15.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "",
                    tint = mytheme,
                )
            },
            label = {Text(text = "Email")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = blue,
                unfocusedBorderColor = mytheme,
                focusedLabelColor = blue,
                unfocusedLabelColor = mytheme,
                cursorColor = blue
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )
        //end of email
        //password
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            modifier = Modifier.fillMaxWidth().padding(start = 15.dp, end = 15.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "",
                    tint = mytheme,
                )
            },
            label = {Text(text = "Password")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = blue,
                unfocusedBorderColor = mytheme,
                focusedLabelColor = blue,
                unfocusedLabelColor = mytheme,
                cursorColor = blue
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )
        //end of password
        Spacer(modifier = Modifier.height(10.dp))
        //buton start
        Button(
            onClick = {},
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(mytheme),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        ) {
            Text(text = "Register")
        }
        //buton end
    }
}

@Preview(showBackground = true)
@Composable
fun FormScreenPreview(){
    FormScreen(navController= rememberNavController())
}