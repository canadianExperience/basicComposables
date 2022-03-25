package com.me.basiccomposables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import com.me.basiccomposables.ui.theme.BasicComposablesTheme
import com.me.simplenavigationcompose.Navigation

@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
@ExperimentalFoundationApi
fun MyApp(){
    BasicComposablesTheme {
        Navigation()
    }
}

