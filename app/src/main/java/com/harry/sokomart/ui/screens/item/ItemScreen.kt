package com.harry.sokomart.ui.screens.item

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import java.lang.reflect.Modifier

@Composable
fun ItemScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize()
    ){  }
}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(navController= rememberNavController())
}