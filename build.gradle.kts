buildscript {
  repositories {
    gradlePluginPortal()
    jcenter()
    google()
    mavenCentral()
  }
  dependencies {
    classpath("com.android.tools.build:gradle:7.0.2")
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
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
  version = "1.5.0"
}
