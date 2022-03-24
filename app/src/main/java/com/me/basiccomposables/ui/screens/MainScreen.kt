package com.me.basiccomposables.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController){
    val screens = MyScreen.values().toList()

    Column(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        screens.forEach { screen ->
            if(screen != MyScreen.Main) {
                Button(
                    onClick = { navController.navigate(screen.name) },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = screen.name)
                }
            }
        }
    }
}