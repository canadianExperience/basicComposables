package com.me.basiccomposables.ui.screens

import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.me.basiccomposables.R

@Composable
fun MyAlertDialog(onDismissDialog: () -> Unit) {
  AlertDialog(
    onDismissRequest = onDismissDialog ,
    title = { Text(text = stringResource(id = R.string.dialog_title)) },
    text = { Text(text = stringResource(id = R.string.dialog_text)) },
    confirmButton = {
      Button(
        colors = ButtonDefaults.buttonColors(
          backgroundColor = colorResource(id = R.color.purple_500)
        ),
        onClick = onDismissDialog
      ) {
        Text(
          text = stringResource(id = R.string.dialog_button_text),
          color = Color.White
        )
      }
    }
  )
}