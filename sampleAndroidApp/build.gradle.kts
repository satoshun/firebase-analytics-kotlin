plugins {
  id("com.android.application")
  kotlin("android")
}

dependencies {
  implementation(project(":analytics"))
//  implementation("com.github.satoshun.firebase:analytics:0.0.5")

  implementation("com.google.android.material:material:1.3.0")
  implementation("androidx.appcompat:appcompat:1.3.0")
}

android {
  compileSdk = 30
  defaultConfig {
    applicationId = "com.github.satoshun.firebase.analytics.sampleAndroidApp"
    minSdk = 21
    targetSdk = 30
    versionCode = 1
    versionName = "1.0"
  }
  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
    }
  }
}

apply {
  plugin("com.google.gms.google-services")
}
