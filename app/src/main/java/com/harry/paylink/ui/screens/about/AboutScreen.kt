package com.harry.paylink.ui.screens.about

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun AboutScreen(navController: NavController){


}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(navController= rememberNavController())
}