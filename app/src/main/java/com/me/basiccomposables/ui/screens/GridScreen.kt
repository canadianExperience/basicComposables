package com.me.basiccomposables.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
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
import kotlin.math.ceil



@Composable
fun GridScreen() {
    GridView(columnCount = 4)
}

@Composable
fun GridView(columnCount: Int) {
    val itemSize = ICONS.size
    val rowCount = ceil(itemSize.toFloat() / columnCount).toInt()
    val gridItems = mutableListOf<List<IconResource>>()
    var position = 0
    for (i in 0 until rowCount) {
        val rowItem = mutableListOf<IconResource>()
        for (j in 0 until columnCount) {
            if (position.inc() <= itemSize) {
                rowItem.add(IconResource(ICONS[position++], true))
            }
        }
        val itemsToFill = columnCount - rowItem.size
        for (j in 0 until itemsToFill) {
            rowItem.add(IconResource(Icons.Filled.Delete, false))
        }
        gridItems.add(rowItem)
    }
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(gridItems) { items ->
            RowItem(items)
        }
    }
}

@Composable
fun RowItem(rowItems: List<IconResource>) {
    Row {
        for (element in rowItems)
            GridIcon(element)
    }
}

@Composable
fun RowScope.GridIcon(iconResource: IconResource) {
    val color = if (iconResource.isVisible)
        colorResource(R.color.purple_500)
    else Color.Transparent
    Icon(
        imageVector = iconResource.imageVector,
        tint = color,
        contentDescription = stringResource(R.string.grid_icon_description),
        modifier = Modifier
            .size(80.dp, 80.dp)
            .weight(1f)
            .padding(16.dp)

    )
}

@Preview(
    showBackground = true,
    heightDp = 840,
    widthDp = 320)
@Composable
fun MyGridPreview() {
    GridScreen()
}
