package com.me.basiccomposables.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.me.basiccomposables.utils.Constants.Companion.ELEMENTS_LIST


@Composable
fun RowScreen() {
    MyRow()
}

@Composable
fun MyRow() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxSize()
    ) {
        ELEMENTS_LIST.forEach { textResId ->
            Text(
                text = stringResource(id = textResId),
                fontSize = 18.sp
            )
        }
    }
}

@Preview(
    showBackground = true,
    heightDp = 840,
    widthDp = 320)
@Composable
fun MyRowPreview() {
    RowScreen()
}
