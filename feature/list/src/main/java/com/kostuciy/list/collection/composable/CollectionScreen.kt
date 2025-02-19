package com.kostuciy.list.collection.composable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun CollectionScreen(
    id: String? = null,
    onVideoClick: (String) -> Unit,
) {
    Box(
        Modifier.fillMaxSize().clickable { onVideoClick("") },
    ) {
        Text(
            modifier = Modifier.align(Alignment.Center),
            text = "CollectionScreen (id = $id)",
        )
    }
}
