plugins {
  id("com.android.application")
  kotlin("android")
}

dependencies {
//  implementation(project(":analytics"))
//  implementation("com.github.satoshun.firebase:analytics:0.0.5")

  implementation(project(":sampleShared"))

  implementation("com.google.android.material:material:1.4.0")
  implementation("androidx.appcompat:appcompat:1.3.1")
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
