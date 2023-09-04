package net.simplifiedcoding.ui.contactUs

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import net.simplifiedcoding.ui.auth.AuthViewModel


@Composable
fun ContactsScreen(viewModel: AuthViewModel?, navController: NavHostController) {
    Column {
        Text(text = "This is the Contacts Page")
    }
}
