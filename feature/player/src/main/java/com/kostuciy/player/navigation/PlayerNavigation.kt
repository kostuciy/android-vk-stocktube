package com.kostuciy.player.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.kostuciy.player.composable.PlayerScreen
import kotlinx.serialization.Serializable

@Serializable
data class Player(
    val id: String? = null,
)

fun NavGraphBuilder.playerRoute(navController: NavController) {
    composable<Player> { backStackEntry ->
        val player: Player = backStackEntry.toRoute()

        PlayerScreen(
            id = player.id,
        )
    }
}

fun NavController.navigateToPlayer(id: String? = null) =
    navigate(Player(id)) {
        launchSingleTop = true
    }
