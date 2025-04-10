package com.harry.sokomart.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.harry.sokomart.R
import com.harry.sokomart.ui.theme.newcyan

@Composable
fun HomeScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize().paint(painter = painterResource(R.drawable.img_11), contentScale = ContentScale.FillBounds)
    ) {

        Text(
            text = "SokoMart",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            text = "An Ecommerce application",
            fontStyle = FontStyle.Italic
        )
        Text(
            text = "SokoMart is a commerce application that enables the buying and selling of goods and services over the internet, encompassing various functionalities like product browsing, shopping carts, payment processing, and order tracking",
        )
        Button(
            onClick = {},
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(newcyan)
        ) {
            Text(text = "See more")
        }
    }

}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(navController= rememberNavController())
}