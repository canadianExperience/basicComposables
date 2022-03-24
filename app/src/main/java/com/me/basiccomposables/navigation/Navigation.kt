package com.me.simplenavigationcompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.me.basiccomposables.ui.screens.MainScreen
import com.me.basiccomposables.ui.screens.MyScreen
import com.me.basiccomposables.ui.screens.TextScreen

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = MyScreen.Main.name
    ){
        composable( route = MyScreen.Main.name){
            MainScreen(navController)
        }
        composable(route = MyScreen.Text.name){
           TextScreen()
        }
    }
}

