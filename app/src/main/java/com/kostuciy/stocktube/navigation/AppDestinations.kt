package com.kostuciy.stocktube.navigation

import androidx.annotation.StringRes
import com.kostuciy.list.navigation.Collection
import com.kostuciy.list.navigation.Feed
import com.kostuciy.player.navigation.Player
import com.kostuciy.ui.R as UiR

enum class AppDestinations(
    val route: Any,
    @StringRes val title: Int,
) {
    FEED(Feed, UiR.string.destination_title_feed),
    COLLECTION(Collection(), UiR.string.destination_title_collection),
    PLAYER(Player(), UiR.string.destination_title_player),
}
