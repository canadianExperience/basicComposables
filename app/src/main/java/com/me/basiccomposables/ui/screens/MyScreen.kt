package com.me.basiccomposables.ui.screens

enum class MyScreen{
    Main,
    Text,
//    TextField,
//    Buttons,
//    Progress,
//    AlertDialog,
//    Row,
//    Column,
//    Box,
//    Surface,
//    Scaffold,
//    Scrolling,
//    ScrollingRow,
//    Grid,
//    GridLazy
    ;

    companion object {
        fun fromRoute(route: String?): MyScreen =
            when (route?.substringBefore("/")) {
                Main.name -> Main
                Text.name -> Text
                null -> Main
                else -> throw IllegalArgumentException("Route $route is not recognized.")
            }
    }
}