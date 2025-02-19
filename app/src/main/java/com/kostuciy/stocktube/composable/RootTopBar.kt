package com.kostuciy.stocktube.composable

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import com.kostuciy.stocktube.navigation.AppDestinations
import com.kostuciy.ui.utils.LightDarkPreview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RootTopBar(
    modifier: Modifier = Modifier,
    currentDestination: AppDestinations,
    onBackButtonClick: () -> Unit,
    onHistoryButtonClick: () -> Unit,
) {
    CenterAlignedTopAppBar(
        modifier = modifier,
        title = {
            Text(
                text = stringResource(currentDestination.title),
                fontWeight = FontWeight.Bold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        },
        navigationIcon = {
            if (currentDestination != AppDestinations.FEED) {
                AppBarButton(
                    icon = Icons.AutoMirrored.Filled.ArrowBack,
                ) { onBackButtonClick() }
            }
        },
        actions = {
            if (currentDestination != AppDestinations.PLAYER) {
                AppBarButton(
                    icon = Icons.Filled.Menu,
                ) { onHistoryButtonClick() }
            }
        },
    )
}

@Composable
fun AppBarButton(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    onClick: () -> Unit,
) {
    IconButton(
        modifier = modifier,
        onClick = onClick,
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
        )
    }
}

@LightDarkPreview
@Composable
fun RootTopBarPreview() {
    val destination = AppDestinations.PLAYER
    Scaffold(
        topBar = {
            RootTopBar(
                currentDestination = destination,
                onBackButtonClick = {},
                onHistoryButtonClick = {},
            )
        },
    ) { _ ->
    }
}
