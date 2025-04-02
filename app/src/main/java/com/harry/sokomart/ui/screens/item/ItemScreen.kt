package com.harry.sokomart.ui.screens.item

import android.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.harry.sokomart.ui.theme.mytheme
import com.harry.sokomart.ui.theme.white

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
                containerColor = mytheme,
                titleContentColor = white,
                navigationIconContentColor = white
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(navController= rememberNavController())
}