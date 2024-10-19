plugins {
    alias(libs.plugins.doko.android.application)
    alias(libs.plugins.doko.android.application.compose)
    alias(libs.plugins.ktlint)
}

android {
    namespace = "com.droidconke.ddsdemo"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.droidconke.ddsdemo"
        versionCode = 1
        versionName = "0.0.01" // X.Y.ZZ; X = Major, Y = minor, Z = Patch level can be many digits
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":dokodesignsytem"))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)
}

dependencyGuard {
    configuration("releaseRuntimeClasspath")
}
