import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

data class Community(val id: String, val name: String)

@Composable
fun YourCommunitiesScreen(navController: NavController, username: String = "Username", communities: List<Community>) {
    Scaffold(
        bottomBar = {
            BottomNavBar()
        },
        containerColor = Color(0xFFF8F8F8)
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            // Header
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Surface(
                        modifier = Modifier
                            .size(48.dp)
                            .clip(CircleShape),
                        color = Color(0xFFDDDDDD)
                    ) {
                        // Placeholder for profile picture
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Profile",
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Column {
                        Text("Hi there", fontSize = 14.sp, color = Color.Gray)
                        Text(username, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
                    }
                }
                IconButton(onClick = { /* Share action */ }) {
                    Icon(Icons.Outlined.Share, contentDescription = "Share")
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Title
            Text("Your Communities", fontSize = 20.sp, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(12.dp))

            // Community List
            LazyColumn {
                items(communities) { community ->
                    CommunityCard(community = community) {
                        // navController.navigate("community/${community.id}")
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }
        }
    }
}

@Composable
fun CommunityCard(community: Community, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            Surface(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape),
                color = Color(0xFFDDDDDD)
            ) {
                Icon(Icons.Default.Person, contentDescription = null, modifier = Modifier.padding(8.dp))
            }
            Spacer(modifier = Modifier.width(16.dp))
            Text(community.name, fontSize = 16.sp, fontWeight = FontWeight.Medium)
        }
    }
}

@Composable
fun BottomNavBar() {
    NavigationBar {
        NavigationBarItem(
            icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
            selected = true,
            onClick = { /* Already on Home */ }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Add, contentDescription = "Add") },
            selected = false,
            onClick = { /* Add new link */ }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Person, contentDescription = "Communities") },
            selected = false,
            onClick = { /* Navigate to Communities */ }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Face, contentDescription = "Profile") },
            selected = false,
            onClick = { /* Navigate to Profile */ }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun YourCommunitiesScreenPreview() {
    val navController = rememberNavController()
    val demoCommunities = listOf(
        Community("1", "Community 1"),
        Community("2", "Community 2")
    )
    YourCommunitiesScreen(navController = navController, communities = demoCommunities)
}
