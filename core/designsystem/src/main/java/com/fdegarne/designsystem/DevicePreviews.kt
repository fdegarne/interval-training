package com.fdegarne.designsystem

import androidx.compose.ui.tooling.preview.Preview

/**
 * Multipreview annotation that represents various device sizes. Add this annotation to a composable
 * to render various devices.
 */
@Preview(name = "phone", device = "spec:width=360, height=640, dpi=480")

annotation class DevicePreviews