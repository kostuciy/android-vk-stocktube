package com.kostuciy.ui.utils

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

@Preview(group = "compact", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO, name = "Light theme", locale = "ru")
@Preview(group = "compact", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES, name = "Dark theme", locale = "ru")
annotation class LightDarkPreview
