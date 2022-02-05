pluginManagement {
  repositories {
    google()
    gradlePluginPortal()
    mavenCentral()
  }
}

rootProject.name = "FirebaseAnalyticsKotlin"

include(":analytics")

include(":sampleAndroidApp")
include(":sampleShared")
