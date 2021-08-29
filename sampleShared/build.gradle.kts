plugins {
  kotlin("multiplatform")
  kotlin("native.cocoapods")
  id("com.android.library")
}

kotlin {
  android()
  ios()
  iosSimulatorArm64()

  cocoapods {
    summary = "Firebase analytics for Kotlin"
    homepage = "https://github.com/satoshun/firebase-analytics-kotlin"

    ios.deploymentTarget = "12.0"

    framework {
      baseName = "shared"
    }
  }

  sourceSets {
    val commonMain by getting {
      dependencies {
        implementation(project(":analytics"))
        //  implementation("com.github.satoshun.firebase:analytics:0.0.5")
      }
    }
    val commonTest by getting {
      dependencies {
        implementation(kotlin("test-common"))
        implementation(kotlin("test-annotations-common"))
      }
    }
    val androidMain by getting {
      dependencies {
      }
    }
    val androidTest by getting {
      dependencies {
        implementation(kotlin("test-junit"))
        implementation("junit:junit:4.13.2")
      }
    }
    val iosMain by getting {
      dependencies {
      }
    }
    val iosTest by getting
  }
}

android {
  compileSdk = 30
  sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
  defaultConfig {
    minSdk = 21
    targetSdk = 30
  }
}