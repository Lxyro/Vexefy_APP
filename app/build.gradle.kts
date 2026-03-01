// app/build.gradle.kts
plugins {
    id("com.android.application") version "8.1.1"
    id("org.jetbrains.kotlin.android") version "1.8.21"
}

android {
    compileSdk = 34
    namespace = "vexefy.live.nofication.android.com"

    defaultConfig {
        applicationId = "vexefy.live.nofication.android.com"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("debug") { }
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.21")
}
