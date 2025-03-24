plugins {
    id("intervals.android.library")
    id("intervals.hilt")
}

android {
    namespace = "com.fdegarne.data"
}

dependencies {
    api(projects.core.database)
    api(projects.core.model)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}