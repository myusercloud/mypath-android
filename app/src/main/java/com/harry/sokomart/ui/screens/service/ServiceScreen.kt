package com.harry.sokomart.ui.screens.service

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ServiceScreen(navController: NavController) {


}
@Preview(showBackground = true)
@Composable
fun ServiceScreenPreview(){
    ServiceScreen(navController= rememberNavController())
}