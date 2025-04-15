import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun PHome(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {

        // Top bar with profile and share icon
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Default.AccountCircle, contentDescription = "Profile", modifier = Modifier.size(40.dp))
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text("Hi there", style = MaterialTheme.typography.bodyMedium)
                    Text("<Username>", fontWeight = FontWeight.Bold)
                }
            }
            Icon(Icons.Default.Share, contentDescription = "Share")
        }

        Spacer(modifier = Modifier.height(16.dp))
        Text("Ready to manage your links today?", style = MaterialTheme.typography.bodyLarge)

        Spacer(modifier = Modifier.height(16.dp))

        // Navigation buttons
        Button(
            onClick = { /* nav to Create Link */ },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp)
        ) {
            Icon(Icons.Default.Create, contentDescription = null)
            Spacer(modifier = Modifier.width(8.dp))
            Text("Create Link")
        }

        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = { /* nav to Your Communities */ },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp)
        ) {
            Icon(Icons.Default.Person, contentDescription = null)
            Spacer(modifier = Modifier.width(8.dp))
            Text("Your Communities")
        }

        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = { /* nav to Payment History */ },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp)
        ) {
            Icon(Icons.Default.Menu, contentDescription = null)
            Spacer(modifier = Modifier.width(8.dp))
            Text("Payment History")
        }

        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = { /* nav to User Profile */ },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp)
        ) {
            Icon(Icons.Default.Person, contentDescription = null)
            Spacer(modifier = Modifier.width(8.dp))
            Text("User Profile")
        }

        Spacer(modifier = Modifier.height(24.dp))
        Text("Your Links", style = MaterialTheme.typography.titleMedium)

        // Filter buttons
        Row(modifier = Modifier.padding(vertical = 8.dp)) {
            Button(onClick = { /* Show All */ }, modifier = Modifier.padding(end = 8.dp)) {
                Text("All")
            }
            Button(onClick = { /* Show Pending */ }, modifier = Modifier.padding(end = 8.dp)) {
                Text("Pending")
            }
            Button(onClick = { /* Show Completed */ }) {
                Text("Completed")
            }
        }

        // List of Link Items
        LinkItem("Recipient 1", "Description of Link 1", "$10.00", "Apr 14")
        LinkItem("Recipient 2", "Description of Link 2", "$12.50", "Apr 13")
        LinkItem("Recipient 3", "Description of Link 3", "$20.00", "Apr 12")

        Spacer(modifier = Modifier.weight(1f))

        // Bottom navigation
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
}

@Composable
fun LinkItem(name: String, description: String, amount: String, dateCreated: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Name of recipient: $name", fontWeight = FontWeight.Bold)
            Text("Description: $description")
            Text("Amount: $amount")
            Text("Date created: $dateCreated", style = MaterialTheme.typography.bodySmall)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PHomePreview() {
    MaterialTheme {
        PHome(navController = rememberNavController())
    }
}
