buildscript {
  repositories {
    gradlePluginPortal()
    jcenter()
    google()
    mavenCentral()
  }
  dependencies {
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.31")
    classpath("com.android.tools.build:gradle:4.2.1")
    classpath("com.google.gms:google-services:4.3.5")
    classpath("org.jetbrains.dokka:dokka-gradle-plugin:0.9.18")
    classpath("com.vanniktech:gradle-maven-publish-plugin:0.14.2")
  }
}

allprojects {
  repositories {
    google()
    jcenter()
    mavenCentral()
  }

  group = "com.github.satoshun.firebase"
  version = "0.0.6"
}
