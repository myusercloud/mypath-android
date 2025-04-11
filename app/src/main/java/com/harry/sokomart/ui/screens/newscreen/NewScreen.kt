package com.harry.sokomart.ui.screens.newscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.harry.sokomart.R
import com.harry.sokomart.ui.theme.blue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavController) {
    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { /* TODO: Add action */ }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        bottomBar = {
            NavigationBar(containerColor = Color.White) {
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0 }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Tasks") },
                    label = { Text("Tasks") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1 }
                )
                Spacer(modifier = Modifier.weight(1f, true))
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Menu, contentDescription = "Tasks") },
                    label = { Text("Tasks") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2 }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 3,
                    onClick = { selectedIndex = 3 }
                )

            }
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .padding(16.dp)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {
                // Header
                Spacer(modifier = Modifier.height(40.dp))
                Row(
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp).horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text("Hi Samantha", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                        Text("Here are your projects", color = Color.Gray)
                    }
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Avatar",
                        modifier = Modifier.size(48.dp)
                    )
                }

                Spacer(modifier = Modifier.height(50.dp))
                Row (){
                    Card (
                        modifier = Modifier.width(150.dp).height(250.dp),
                        elevation = CardDefaults.cardElevation(10.dp),
                    ){
                        Column (
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                        ){
                            Image(
                                painter = painterResource(R.drawable.img_15),
                                contentDescription = "home",
                                modifier = Modifier.size(100.dp).clip(shape = RoundedCornerShape(10.dp)),
                            )
                            Text(
                                text = "Contact"
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(19.dp))
                    Card (
                        modifier = Modifier.width(150.dp).height(250.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ){
                        Column (
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                        ){
                            Image(
                                painter = painterResource(R.drawable.img_12),
                                contentDescription = "home",
                                modifier = Modifier.size(100.dp).clip(shape = RoundedCornerShape(10.dp)),
                            )
                            Text(
                                text = "Contact"
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(19.dp))
                    Card (
                        modifier = Modifier.width(150.dp).height(250.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ){
                        Column (
                            modifier = Modifier.fillMaxSize().horizontalScroll(rememberScrollState()),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                        ){
                            Image(
                                painter = painterResource(R.drawable.img_12),
                                contentDescription = "home",
                                modifier = Modifier.size(100.dp).clip(shape = RoundedCornerShape(10.dp)),
                            )
                            Text(
                                text = "Contact"
                            )
                        }
                    }
                }



                Spacer(modifier = Modifier.height(24.dp))
                Text("Personal Tasks", fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(12.dp))

                PersonalTaskCard(
                    title = "NDA Review for website project",
                    time = "Today • 10pm",
                    icon = Icons.Default.Done,
                    iconBg = Color(0xFFFDD835)
                )
                Spacer(modifier = Modifier.height(8.dp))
                PersonalTaskCard(
                    title = "Email Reply for Green Project",
                    time = "Today • 10pm",
                    icon = Icons.Default.Email,
                    iconBg = Color(0xFF29B6F6)
                )
            }
        }
    )
}

@Composable
fun ProjectCard(title: String, backgroundColor: Color, icon: ImageVector) {
    Card(
        modifier = Modifier
            .size(width = 180.dp, height = 120.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor)
    ) {
        Column(
            modifier = Modifier
                .padding(12.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(icon, contentDescription = null, tint = Color.White)
            Text(title, color = Color.White, fontWeight = FontWeight.Bold)
            Text("1.2 tasks", color = Color.White.copy(alpha = 0.7f), fontSize = 12.sp)
        }
    }
}

@Composable
fun PersonalTaskCard(title: String, time: String, icon: ImageVector, iconBg: Color) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .background(iconBg, shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(icon, contentDescription = null, tint = Color.White)
            }
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(title, fontWeight = FontWeight.Bold)
                Text(time, fontSize = 12.sp, color = Color.Gray)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview() {
    AboutScreen(navController = rememberNavController())
}
