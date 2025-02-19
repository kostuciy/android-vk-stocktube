package com.kostuciy.stocktube.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.kostuciy.list.navigation.ListGraph
import com.kostuciy.list.navigation.listGraph
import com.kostuciy.player.navigation.navigateToPlayer
import com.kostuciy.player.navigation.playerRoute

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = ListGraph,
    ) {
        listGraph(navController::navigateToPlayer)
        playerRoute(navController)
    }
}
