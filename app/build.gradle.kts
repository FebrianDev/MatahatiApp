plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
    id ("kotlin-kapt")
    id ("kotlin-parcelize")
    id ("dagger.hilt.android.plugin")
}

android {
    namespace = "com.febrian.matahatiapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.febrian.matahatiapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        viewBinding {
            enable = true
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-firestore:24.9.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //hilt
    implementation ("com.google.dagger:hilt-android:2.47")
    kapt ("com.google.dagger:hilt-compiler:2.47")
    implementation ("androidx.activity:activity-ktx:1.6.1")

//    implementation("com.google.android.exoplayer:exoplayer:2.19.1")
//    implementation("com.google.android.exoplayer:exoplayer-core:2.19.1")
//    implementation("com.google.android.exoplayer:exoplayer-dash:2.19.1")
//    implementation("com.google.android.exoplayer:exoplayer-hls:2.19.1")
//    implementation("com.google.android.exoplayer:exoplayer-smoothstreaming:2.19.1")
//    implementation("com.google.android.exoplayer:exoplayer-ui:2.19.1")

    //exo player
    implementation ("androidx.media3:media3-exoplayer:1.2.0")
    implementation ("androidx.media3:media3-exoplayer-dash:1.2.0")
    implementation ("androidx.media3:media3-ui:1.2.0")

    //splitties
    implementation("com.louiscad.splitties:splitties-fun-pack-android-base:3.0.0")
}