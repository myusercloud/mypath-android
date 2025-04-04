package com.harry.sokomart.ui.screens.intent

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun IntentScreen(navController: NavController){


}

@Preview(showBackground = true)
@Composable
fun IntentScreenPreview(){
    IntentScreen(navController= rememberNavController())
}