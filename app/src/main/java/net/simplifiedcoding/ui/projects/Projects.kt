package net.simplifiedcoding.ui.projects

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import net.simplifiedcoding.ui.auth.AuthViewModel


@Composable
fun ProjectScreen(viewModel: AuthViewModel?, navController: NavHostController) {
    Column (
        modifier=Modifier.background(Color.Gray) .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {


    }


}