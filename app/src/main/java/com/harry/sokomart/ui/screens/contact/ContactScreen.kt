package com.harry.sokomart.ui.screens.contact

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController

@Composable
fun ContactScreen(navController: NavController){


}

@Preview(showBackground = true)
@Composable
fun ContactScreenPreview(){
    ContactScreen(navController= rememberNavController())
}
