package com.placement.starbucks_spui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.navigation.NavHostController
import com.google.firebase.annotations.concurrent.Background
import com.placement.starbucks_spui.components.LogoComponent
import com.placement.starbucks_spui.navigation.home
import kotlinx.coroutines.delay

@Composable
fun StartScreen(
    navHostController: NavHostController
) {

    LaunchedEffect(key1 = Unit) {
        delay(2000)
        navHostController.navigate(home)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White), contentAlignment = Alignment.Center
    ) {
        LogoComponent() // this is starbucks log//image_component.kt me define hai
    }


}