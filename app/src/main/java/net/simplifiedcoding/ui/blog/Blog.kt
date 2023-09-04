package net.simplifiedcoding.ui.blog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import net.simplifiedcoding.ui.auth.AuthViewModel


@Composable
fun BlogScreen(viewModel: AuthViewModel?, navController: NavHostController) {
    Column (
        modifier=Modifier.fillMaxSize().background(Color.Blue)
    ){
        Text(text = "This is the Blog page")
    }
}

