package com.kostuciy.stocktube.composable

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.kostuciy.list.navigation.navigateToCollection
import com.kostuciy.stocktube.navigation.AppDestinations
import com.kostuciy.stocktube.navigation.AppNavHost

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RootScreen() {
    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            val backStackEntryState = navController.currentBackStackEntryAsState()
            val currentDestination by remember {
                derivedStateOf {
                    AppDestinations.entries.firstOrNull { destination ->
                        backStackEntryState
                            .value
                            ?.destination
                            ?.hierarchy
                            ?.any { it.hasRoute(route = destination.route::class) } == true
                    } ?: AppDestinations.FEED
                }
            }

            RootTopBar(
                currentDestination = currentDestination,
                onBackButtonClick = navController::popBackStack,
                onHistoryButtonClick = { navController.navigateToCollection() },
            )
        },
    ) { innerPadding ->
        AppNavHost(
            modifier = Modifier.padding(innerPadding),
            navController = navController,
        )
    }
}
