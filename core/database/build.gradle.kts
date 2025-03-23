plugins {
    id("intervals.android.library")
    id("intervals.room")
    id("intervals.hilt")
}

android {
    namespace = "com.fdegarne.database"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
}