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
    prod(
        FlavorDimension.contentType
    ),
}

fun configureFlavors(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
    flavorConfigurationBlock: ProductFlavor.(flavor: IntervalsFlavor) -> Unit = {},
) {
    commonExtension.apply {
        FlavorDimension.values().forEach { flavorDimension ->
            flavorDimensions += flavorDimension.name
        }

        productFlavors {
            IntervalsFlavor.values().forEach { IntervalsFlavor ->
                register(IntervalsFlavor.name) {
                    dimension = IntervalsFlavor.dimension.name
                    flavorConfigurationBlock(this, IntervalsFlavor)
                    if (this@apply is ApplicationExtension && this is ApplicationProductFlavor) {
                        if (IntervalsFlavor.applicationIdSuffix != null) {
                            applicationIdSuffix = IntervalsFlavor.applicationIdSuffix
                        }
                    }
                }
            }
        }
    }
}