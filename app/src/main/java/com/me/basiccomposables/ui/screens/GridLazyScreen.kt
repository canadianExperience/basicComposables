package com.me.basiccomposables.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.me.basiccomposables.R
import com.me.basiccomposables.utils.Constants.Companion.ICONS
import com.me.basiccomposables.utils.IconResource

@ExperimentalFoundationApi
@Composable
fun GridLazyScreen() {
    LazyVerticalGrid(
        modifier = Modifier.fillMaxSize(),
        cells = GridCells.Fixed(5),
        content = {
            items(ICONS) { item ->
                GridIcon(IconResource(item, true))
            }
        }
    )
}

@Composable
fun GridIcon(iconResource: IconResource) {
    val color = if (iconResource.isVisible)
        colorResource(R.color.teal_700)
    else Color.Transparent
    Icon(
        imageVector = iconResource.imageVector,
        tint = color,
        contentDescription = stringResource(R.string.grid_icon_description),
        modifier = Modifier
            .size(80.dp, 80.dp)
            .padding(16.dp)
    )
}

@Preview(
    showBackground = true,
    heightDp = 840,
    widthDp = 320)
@Composable
@ExperimentalFoundationApi
fun MyGridLazyPreview() {
    GridLazyScreen()
}


