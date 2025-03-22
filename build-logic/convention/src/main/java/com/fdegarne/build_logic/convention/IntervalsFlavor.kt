package com.fdegarne.build_logic.convention

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.ApplicationProductFlavor
import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.ProductFlavor

@Suppress("EnumEntryName")
enum class FlavorDimension {
    contentType
}

@Suppress("EnumEntryName")
enum class IntervalsFlavor(
    val dimension: FlavorDimension,
    val applicationIdSuffix: String? = null
) {
    dev(
        FlavorDimension.contentType,
        applicationIdSuffix = ".dev"
    ),
    prod(
        FlavorDimension.contentType
    ),
}

fun configureFlavors(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
    flavorConfigurationBlock: ProductFlavor.(flavor: IntervalsFlavor) -> Unit = {},
) {
    commonExtension.apply {
        flavorDimensions += FlavorDimension.contentType.name

        productFlavors {
            IntervalsFlavor.values().forEach { intervalsFlavor ->
                create(intervalsFlavor.name) {
                    dimension = intervalsFlavor.dimension.name
                    flavorConfigurationBlock(this, intervalsFlavor)
                    if (this@apply is ApplicationExtension && this is ApplicationProductFlavor) {
                        if (intervalsFlavor.applicationIdSuffix != null) {
                            applicationIdSuffix = intervalsFlavor.applicationIdSuffix
                        }
                    }
                }
            }
        }
    }
}