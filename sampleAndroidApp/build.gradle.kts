plugins {
  id("com.android.application")
  kotlin("android")
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

dependencies {
  implementation(project(":sampleShared"))

  implementation("com.google.android.material:material:1.4.0")
  implementation("androidx.appcompat:appcompat:1.3.1")
}

apply {
  plugin("com.google.gms.google-services")
}
