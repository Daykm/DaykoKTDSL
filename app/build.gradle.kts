plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    buildToolsVersion("26.0.2")
    compileSdkVersion(26)

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(26)

        applicationId = "io.dayko.androidkotlindsl"
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles("proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("com.android.support:appcompat-v7:26.1.0")
    implementation("com.android.support.constraint:constraint-layout:1.0.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jre7:1.1.51")
}
