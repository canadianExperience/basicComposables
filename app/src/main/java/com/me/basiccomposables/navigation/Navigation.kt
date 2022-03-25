package com.me.simplenavigationcompose

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.me.basiccomposables.MyScreen
import com.me.basiccomposables.ui.screens.*

@ExperimentalFoundationApi
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
        composable(route = MyScreen.TextField.name){
            TextFieldScreen()
        }
        composable(route = MyScreen.Buttons.name){
            ButtonsScreen()
        }
        composable(route = MyScreen.Progress.name){
            ProgressScreen()
        }
        composable(route = MyScreen.Row.name){
            RowScreen()
        }
        composable(route = MyScreen.Column.name){
            ColumnScreen()
        }
        composable(route = MyScreen.Box.name){
            BoxScreen()
        }
        composable(route = MyScreen.Surface.name){
            SurfaceScreen()
        }
        composable(route = MyScreen.Scaffold.name){
            ScaffoldScreen()
        }
        composable(route = MyScreen.Scrolling.name){
            ScrollingScreen()
        }
        composable(route = MyScreen.ScrollingRow.name){
            ScrollingRowScreen()
        }
        composable(route = MyScreen.Grid.name){
            GridScreen()
        }
        composable(route = MyScreen.GridLazy.name){
            GridLazyScreen()
        }
    }
}

