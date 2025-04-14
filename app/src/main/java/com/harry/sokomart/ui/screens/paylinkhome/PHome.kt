package com.harry.sokomart.ui.screens.paylinkhome

import android.R.attr.text
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.harry.sokomart.R

@Composable
fun AboutScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        Spacer(modifier = Modifier.height(30.dp))

        Row (){
            Spacer(modifier = Modifier.width(10.dp))
            Image(
                painter = painterResource(id = R.drawable.img_12),
                contentDescription = "home",
                modifier = Modifier.size(50.dp),
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column (){
                Text(text = "Hi There")
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Username")
            }
        }


        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Ready to manage your links today?",
            style = MaterialTheme.typography.bodyMedium
        )
    }
}


@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(navController= rememberNavController())
}