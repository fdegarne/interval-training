plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    id("intervals.room")
    id("intervals.hilt")
}

android {
    namespace = "com.fdegarne.database"

    compileSdk = 35

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
}