// Top-level build file where you can add configuration options common to all sub-projects/modules.
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    id("com.google.dagger.hilt.android") version "2.52" apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "1.8.21"
    id("com.google.gms.google-services") version "4.4.2" apply false
    id("com.google.firebase.crashlytics") version "3.0.2" apply false

}

// Adding the buildscript block for classpath dependencies
buildscript {
    dependencies {
        // Include the Android Gradle plugin and Kotlin Gradle plugin
        classpath(libs.gradle) // or latest version
        classpath(kotlin("gradle-plugin", version = "1.8.0")) // or latest version
        classpath(libs.hilt.android.gradle.plugin) // Include Hilt plugin

    }
}

