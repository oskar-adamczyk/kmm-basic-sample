plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "com.jetbrains.androidApp"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.0")

    def appCenterSdkVersion = '4.3.1'
    implementation "com.microsoft.appcenter:appcenter-analytics:${appCenterSdkVersion}"
    implementation "com.microsoft.appcenter:appcenter-crashes:${appCenterSdkVersion}"
}