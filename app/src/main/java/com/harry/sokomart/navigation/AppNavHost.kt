package com.harry.sokomart.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.harry.sokomart.ui.screens.about.AboutScreen
import com.harry.sokomart.ui.screens.home.HomeScreen
import com.harry.sokomart.ui.screens.intent.IntentScreen
import com.harry.sokomart.ui.screens.item.ItemScreen
import com.harry.sokomart.ui.screens.more.MoreScreen
import com.harry.sokomart.ui.screens.start.StartScreen

@RequiresApi(Build.VERSION_CODES.M)
@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_START
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_MORE) {
            MoreScreen(navController)
        }
        composable(ROUT_DASHBOARD) {
            MoreScreen(navController)
        }
        composable(ROUT_SERVICE) {
            MoreScreen(navController)
        }

    }
}
