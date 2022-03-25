package com.me.basiccomposables.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.me.basiccomposables.MyScreen

@Composable
fun MainScreen(navController: NavController){
    val screens = MyScreen.values().toList()

    var showDialogState by remember { mutableStateOf(false) }
    if(showDialogState) {
        MyAlertDialog(onDismissDialog = { showDialogState = false })
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(
                state = rememberScrollState(),
                reverseScrolling = false
            )
            .padding(horizontal = 50.dp)
    ){
        screens.forEachIndexed { index, screen ->
            if(screen != MyScreen.Main) {
                if(index%2==0) { // Even
                    OutlinedButton(
                        onClick = {
                            if (screen.name == MyScreen.AlertDialog.name) {
                                showDialogState = true
                            } else navController.navigate(screen.name)
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                    )
                    {
                        Text(text = screen.name)
                    }
                } else {
                    Button(
                        onClick = {
                            if (screen.name == MyScreen.AlertDialog.name) {
                                showDialogState = true
                            } else navController.navigate(screen.name)
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp),
                    )
                    {
                        Text(text = screen.name)
                    }
                }
            }
        }
    }
}