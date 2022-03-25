package com.me.basiccomposables.ui.screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.me.basiccomposables.R

@Composable
fun ScrollingScreen() {
    MyScrollingScreen(modifier = Modifier)
}

@Composable
fun MyScrollingScreen(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(
                state = rememberScrollState(),
                reverseScrolling = false
            )
    ) {

        for (i in 0..50) {
            BookImage(
                R.drawable.pets,
                R.string.image_description
            )
        }
    }
}

@Composable
fun BookImage(@DrawableRes imageResId: Int, @StringRes contentDescriptionResId: Int) {
    Image(
        bitmap = ImageBitmap.imageResource(imageResId),
        contentDescription = stringResource(contentDescriptionResId),
        contentScale = ContentScale.Crop,
        modifier = Modifier
 //           .size(100.dp, 100.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(
                start = 8.dp,
                top = 8.dp,
                end = 8.dp,
                bottom = 8.dp
            )
    )
}

@Preview(
    showBackground = true,
    heightDp = 840,
    widthDp = 320)
@Composable
fun MyScrollingPreview() {
    ScrollingScreen()
}