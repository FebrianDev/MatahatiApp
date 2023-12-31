buildscript {

    repositories {
        google()
        mavenCentral()
        // Configure the Maven repository address for the HMS Core SDK.
    }

    dependencies {
        classpath("com.google.gms:google-services:4.4.0")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.47")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.4" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}