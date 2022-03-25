package com.me.basiccomposables.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProgressScreen() {
    Column(modifier = Modifier.padding(horizontal = 32.dp)){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CircularProgressIndicator(
                color = MaterialTheme.colors.secondary,
                strokeWidth = 3.dp,
            )
            Spacer(modifier = Modifier.height(100.dp))
            LinearProgressIndicator(progress = 0.8f)
        }
    }
}

@Preview(
    showBackground = true,
    heightDp = 840,
    widthDp = 320)
@Composable
fun MyProgressPreview() {
    ProgressScreen()
}