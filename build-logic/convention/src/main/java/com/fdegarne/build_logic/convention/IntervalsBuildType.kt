package com.fdegarne.build_logic.convention

enum class IntervalsBuildType(
    val applicationIdSuffix: String? = null
) {
    DEBUG(".debug"),
    RELEASE,
}