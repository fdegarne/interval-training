plugins {
    id("intervals.android.library")
    id("intervals.room")
    id("intervals.hilt")
}

android {
    namespace = "com.fdegarne.database"
}

dependencies {
    implementation(projects.core.model)

    implementation(libs.kotlinx.coroutines.android)
}