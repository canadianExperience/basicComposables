package com.me.basiccomposables.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.me.basiccomposables.R

@Composable
fun ButtonsScreen() {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        MyButton()
        MyRadioGroup()
        MyFloatingActionButton()
    }
}

@Composable
fun MyButton() {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            backgroundColor = MaterialTheme.colors.primary
        ),
        border = BorderStroke(
            3.dp,
            color = MaterialTheme.colors.secondary
        )
    ) {
        Text(
            text = stringResource(id = R.string.button_text),
            color = Color.White
        )
    }
}

@Composable
fun MyRadioGroup() {
    val radioButtons = listOf(0, 1, 2)
    val selectedButton = remember { mutableStateOf(radioButtons.first()) }
    Column {
        radioButtons.forEach { index ->
            val isSelected = index == selectedButton.value
            val colors = RadioButtonDefaults.colors(
                selectedColor = Color.Red,
                unselectedColor = colorResource(
                    id = R.color.purple_200
                ),
                disabledColor = Color.LightGray
            )
            RadioButton(
                colors = colors,
                selected = isSelected,
                onClick = { selectedButton.value = index }
            )
        }
    }
}

@Composable
fun MyFloatingActionButton() {
    FloatingActionButton(
        onClick = {},
        backgroundColor = colorResource(
            id = R.color.teal_200
        ),
        contentColor = MaterialTheme.colors.primary,
        content = {
            Icon(
                Icons.Filled.Favorite, contentDescription = "FAB"
            )
        }
    )
}

@Preview(
    showBackground = true,
    heightDp = 840,
    widthDp = 320)
@Composable
fun MyButtonsPreview() {
    ButtonsScreen()
}
