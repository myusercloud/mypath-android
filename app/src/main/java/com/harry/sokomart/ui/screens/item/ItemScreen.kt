package com.harry.sokomart.ui.screens.item

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.harry.sokomart.R
import com.harry.sokomart.navigation.ROUT_INTENT
import com.harry.sokomart.ui.theme.mytheme
import com.harry.sokomart.ui.theme.white

@RequiresApi(Build.VERSION_CODES.M)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        //TopAppBar
        TopAppBar(
            title = {
              Text(text = "Kai & Karo | Cars")
                    },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = mytheme,
                titleContentColor = white,
                navigationIconContentColor = white,
                actionIconContentColor = white
            ),
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "")
                }
                IconButton(onClick = {
                    navController.navigate(ROUT_INTENT)
                }) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                }
            },

        )
        //End of TopAppBar

        Column (
            modifier = Modifier.verticalScroll(rememberScrollState())
        ){
            //Start row
            Row (modifier = Modifier.padding(start = 5.dp, end = 5.dp)){
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "home",
                    modifier = Modifier.width(200.dp).height(200.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column (){
                    Text(
                        text = "Porsche Cayenne",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "A reliable SUV just for you.",
                        fontSize = 19.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Ksh 12.4 million",
                        textDecoration = TextDecoration.LineThrough,
                        fontSize = 19.sp
                    )
                    Text(
                        text = "Ksh 3.4 million",
                        fontSize = 19.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row (){
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                    }

                }
            }
            //End row
            Row (modifier = Modifier.padding(start = 5.dp, end = 5.dp)){
                Image(
                    painter = painterResource(id = R.drawable.img_1),
                    contentDescription = "home",
                    modifier = Modifier.width(200.dp).height(200.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column (){
                    Text(
                        text = "Golf R",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "A reliable SUV just for you.",
                        fontSize = 19.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Ksh 12.4 million",
                        textDecoration = TextDecoration.LineThrough,
                        fontSize = 19.sp
                    )
                    Text(
                        text = "Ksh 3.4 million",
                        fontSize = 19.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row (){
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                    }

                }
            }
            //Start row
            Row (modifier = Modifier.padding(start = 5.dp, end = 5.dp)){
                Image(
                    painter = painterResource(id = R.drawable.img_2),
                    contentDescription = "home",
                    modifier = Modifier.width(200.dp).height(200.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column (){
                    Text(
                        text = "Mercedes Amg",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "A reliable SUV just for you.",
                        fontSize = 19.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Ksh 12.4 million",
                        textDecoration = TextDecoration.LineThrough,
                        fontSize = 19.sp
                    )
                    Text(
                        text = "Ksh 3.4 million",
                        fontSize = 19.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row (){
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                    }

                }
            }
            //End row
            //Start row
            Row (modifier = Modifier.padding(start = 5.dp, end = 5.dp)){
                Image(
                    painter = painterResource(id = R.drawable.img_4),
                    contentDescription = "home",
                    modifier = Modifier.width(200.dp).height(200.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column (){
                    Text(
                        text = "Mercedes Amg G63",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "A reliable SUV just for you.",
                        fontSize = 19.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Ksh 12.4 million",
                        textDecoration = TextDecoration.LineThrough,
                        fontSize = 19.sp
                    )
                    Text(
                        text = "Ksh 3.4 million",
                        fontSize = 19.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row (){
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                    }

                }
            }
            //End row
            //Start row
            Row (modifier = Modifier.padding(start = 5.dp, end = 5.dp)){
                Image(
                    painter = painterResource(id = R.drawable.img_3),
                    contentDescription = "home",
                    modifier = Modifier.width(200.dp).height(200.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column (){
                    Text(
                        text = "Mercedes Amg gt",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "A reliable SUV just for you.",
                        fontSize = 19.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Ksh 12.4 million",
                        textDecoration = TextDecoration.LineThrough,
                        fontSize = 19.sp
                    )
                    Text(
                        text = "Ksh 3.4 million",
                        fontSize = 19.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row (){
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                    }

                }
            }
            //End row
            //Start row
            Row (modifier = Modifier.padding(start = 5.dp, end = 5.dp)){
                Image(
                    painter = painterResource(id = R.drawable.img_2),
                    contentDescription = "home",
                    modifier = Modifier.width(200.dp).height(200.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column (){
                    Text(
                        text = "Mercedes Amg",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "A reliable SUV just for you.",
                        fontSize = 19.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Ksh 12.4 million",
                        textDecoration = TextDecoration.LineThrough,
                        fontSize = 19.sp
                    )
                    Text(
                        text = "Ksh 3.4 million",
                        fontSize = 19.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row (){
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                    }

                }
            }
            //End row
            //Start row
            Row (modifier = Modifier.padding(start = 5.dp, end = 5.dp)){
                Image(
                    painter = painterResource(id = R.drawable.img_5),
                    contentDescription = "home",
                    modifier = Modifier.width(200.dp).height(200.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column (){
                    Text(
                        text = "Cherokee Trackhawk",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "A reliable SUV just for you.",
                        fontSize = 19.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Ksh 12.4 million",
                        textDecoration = TextDecoration.LineThrough,
                        fontSize = 19.sp
                    )
                    Text(
                        text = "Ksh 3.4 million",
                        fontSize = 19.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Row (){
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                        Icon(imageVector = Icons.Default.Star, contentDescription = "")
                    }

                }
            }
            //End row
        }
    }
}

@RequiresApi(Build.VERSION_CODES.M)
@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(navController= rememberNavController())
}