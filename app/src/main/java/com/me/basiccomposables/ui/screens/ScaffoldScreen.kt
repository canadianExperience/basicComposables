package com.me.basiccomposables.ui.screens

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.me.basiccomposables.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun ScaffoldScreen() {
    MyScaffold()
}

@Composable
fun MyScaffold() {
    val scaffoldState: ScaffoldState = rememberScaffoldState()
    val scope: CoroutineScope = rememberCoroutineScope()
    Scaffold(
            scaffoldState = scaffoldState,
            contentColor = MaterialTheme.colors.primaryVariant,
            content = { MyRow() },
            topBar = {
                MyTopAppBar(
                        scaffoldState = scaffoldState,
                        scope = scope
                )
            },
            bottomBar = { MyBottomAppBar() },
            drawerContent = { MyColumn() }
    )
}

@Composable
fun MyTopAppBar(
        scaffoldState: ScaffoldState,
        scope: CoroutineScope
) {
    val drawerState = scaffoldState.drawerState
    TopAppBar(
            navigationIcon = {
                IconButton(
                        content = {
                            Icon(
                                    Icons.Default.Menu,
                                    tint = Color.White,
                                    contentDescription = stringResource(id = R.string.menu_content_description)
                            )
                        },
                        onClick = {
                            scope.launch {
                                if (drawerState.isClosed)
                                    drawerState.open() else drawerState.close()
                            }
                        }
                )
            },
            title = {
                Text(
                        text = stringResource(id = R.string.app_name),
                        color = Color.White
                )
            },
            backgroundColor = MaterialTheme.colors.primary
    )
}

@Composable
fun MyBottomAppBar() {
    BottomAppBar(
            content = {},
            backgroundColor = MaterialTheme.colors.secondary
    )
}

@Preview(
    showBackground = true,
    heightDp = 840,
    widthDp = 320)
@Composable
fun MyScaffoldPreview() {
    ScaffoldScreen()
}
