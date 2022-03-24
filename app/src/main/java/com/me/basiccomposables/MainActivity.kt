package com.me.basiccomposables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.me.basiccomposables.ui.theme.BasicComposablesTheme
import com.me.simplenavigationcompose.Navigation


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp(){
    BasicComposablesTheme {
//        val allScreens = MyScreen.values().toList()
//        val navController = rememberNavController()
//        val backstackEntry = navController.currentBackStackEntryAsState()
//        val currentScreen = MyScreen.fromRoute(
//            backstackEntry.value?.destination?.route
//        )

        Navigation()

    }
}

