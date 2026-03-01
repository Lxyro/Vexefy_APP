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

    // Ensure Java compatibility is 17 so Kotlin and javac targets match
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    // Newer Kotlin DSL: set jvm toolchain to 17 for kotlin compile tasks
    kotlinOptions {
        // This is used by Kotlin Gradle plugin for old DSL consumers; keep for safety
        jvmTarget = "17"
    }

    // For Kotlin JVM toolchain (recommended)
    kotlin {
        jvmToolchain(17)
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

// Note: repositories are provided at the settings level (dependencyResolutionManagement)
