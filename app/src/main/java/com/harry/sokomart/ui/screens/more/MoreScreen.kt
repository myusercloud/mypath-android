package com.harry.sokomart.ui.screens.more

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.harry.sokomart.R
import com.harry.sokomart.navigation.ROUT_ITEM
import com.harry.sokomart.ui.theme.mytheme
import com.harry.sokomart.ui.theme.white

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoreScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title = {
                Text(text = "Kai & Karo | Product")
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = mytheme,
                titleContentColor = white,
                navigationIconContentColor = white,
                actionIconContentColor = white
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")

                }
            },

            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription = "")
                }
            },

            )
        //End of TopAppBar
        Spacer(modifier = Modifier.height(20.dp))
        //box start
        Box (
            modifier = Modifier.fillMaxWidth().height(250.dp)

        ){
            Text(
                text = "Porsche Cayenne",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
            Spacer(modifier = Modifier.height(5.dp))
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "home",
                modifier = Modifier.fillMaxSize()
            )
            Icon(
                imageVector = Icons.Default.Favorite, contentDescription = "",
                modifier = Modifier.align(alignment = Alignment.TopEnd).padding(8.dp)
            )

        }
        //end of box
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Porsche Cayenne",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
        //row start
        Row (
            modifier = Modifier.padding(start = 20.dp).horizontalScroll(rememberScrollState())
        ){
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "home",
                modifier = Modifier.fillMaxWidth(),
            )
            Image(
                painter = painterResource(id = R.drawable.img_6),
                contentDescription = "home",
                modifier = Modifier.fillMaxWidth(),
            )
            Image(
                painter = painterResource(id = R.drawable.img_7),
                contentDescription = "home",
                modifier = Modifier.fillMaxWidth(),
            )
            Image(
                painter = painterResource(id = R.drawable.img_8),
                contentDescription = "home",
                modifier = Modifier.fillMaxWidth(),
            )
        }
        //row end
        Button(
            onClick = {
                val simToolKitLaunchIntent =
                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
            },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(mytheme),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        ) {
            Text(text = "Purchase Here")
        }
        Spacer(modifier = Modifier.width(10.dp))

    }

}

@Preview(showBackground = true)
@Composable
fun MoreScreenPreview(){
    MoreScreen(navController= rememberNavController())
}