package com.harry.sokomart.ui.screens.item

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.harry.sokomart.ui.theme.mytheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Item") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = mytheme
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(navController= rememberNavController())
}