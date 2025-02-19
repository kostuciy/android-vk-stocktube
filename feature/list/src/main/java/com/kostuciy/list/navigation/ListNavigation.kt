package com.kostuciy.list.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.navigation.toRoute
import com.kostuciy.list.collection.composable.CollectionScreen
import com.kostuciy.list.feed.composable.FeedScreen
import kotlinx.serialization.Serializable

@Serializable
data object ListGraph

@Serializable
data object Feed

@Serializable
data class Collection(
    val id: String? = null,
)

fun NavGraphBuilder.feedRoute() {
    composable<Feed> {
        FeedScreen()
    }
}

fun NavGraphBuilder.collectionRoute(onVideoClick: (String) -> Unit) {
    composable<Collection> { backStackEntry ->
        val collection: Collection = backStackEntry.toRoute()

        CollectionScreen(
            id = collection.id,
            onVideoClick = onVideoClick,
        )
    }
}

fun NavGraphBuilder.listGraph(onVideoClick: (String) -> Unit) {
    navigation<ListGraph>(startDestination = Feed) {
        feedRoute()
        collectionRoute(onVideoClick)
    }
}

fun NavController.navigateToCollection(id: String? = null) =
    navigate(Collection(id)) {
        launchSingleTop = true
    }
