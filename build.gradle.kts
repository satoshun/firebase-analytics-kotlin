buildscript {
  repositories {
    gradlePluginPortal()
    jcenter()
    google()
    mavenCentral()
  }
  dependencies {
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.21")
//    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30-M1")
    classpath("com.android.tools.build:gradle:4.1.1")
    classpath("com.google.gms:google-services:4.3.4")
  }
}

allprojects {
  repositories {
    google()
    jcenter()
    mavenCentral()
  }
}
