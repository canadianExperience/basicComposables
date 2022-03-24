package com.me.basiccomposables.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.me.basiccomposables.R

@Composable
fun TextScreen(){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        MyText()
    }
}

@Preview(
    showBackground = true,
    heightDp = 840,
    widthDp = 320)
@Composable
fun MyText() {
    Text(text = stringResource(id = R.string.text_compose),
        fontStyle = FontStyle.Italic,
        color = MaterialTheme.colors.primary,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold
    )
}