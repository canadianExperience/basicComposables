package com.me.basiccomposables.ui.screens

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.me.basiccomposables.R


@Composable
fun ScrollingRowScreen() {
    MyScrollingRow()
}

@Composable
fun MyScrollingRow(modifier: Modifier = Modifier) {
    Row(modifier = modifier.horizontalScroll(rememberScrollState())) {
       for (i in 0..20){
           BookImage(
               R.drawable.pets,
               R.string.image_description
           )
       }
    }
}

@Preview(
    showBackground = true,
    heightDp = 840,
    widthDp = 320)
@Composable
fun MyScrollingRowPreview() {
    ScrollingRowScreen()
}
