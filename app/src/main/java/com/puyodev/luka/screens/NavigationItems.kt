package com.puyodev.luka.screens

import androidx.compose.ui.graphics.vector.ImageVector

// Create Navigation Items Class to Select Unselect items
data class NavigationItems(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val badgeCount: Int? = null
)