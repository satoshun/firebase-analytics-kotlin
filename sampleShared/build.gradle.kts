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
//        implementation("com.github.satoshun.firebase:analytics:0.0.5")
      }
    }
    val commonTest by getting

    val androidMain by getting
    val androidTest by getting

    val iosMain by getting
    val iosTest by getting
    val iosSimulatorArm64Main by sourceSets.getting
    val iosSimulatorArm64Test by sourceSets.getting
    iosSimulatorArm64Main.dependsOn(iosMain)
    iosSimulatorArm64Test.dependsOn(iosTest)
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
