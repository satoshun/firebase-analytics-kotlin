pluginManagement {
  repositories {
    google()
    jcenter()
    gradlePluginPortal()
    mavenCentral()
  }
}

rootProject.name = "FirebaseAnalyticsKotlin"

include(":analytics")

include(":sampleAndroidApp")
include(":sampleShared")
