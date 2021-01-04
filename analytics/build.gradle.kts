import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
  id("com.android.library")
  id("maven-publish")

  kotlin("multiplatform")
  kotlin("native.cocoapods")
}

group = "jp.co.matchingagent.firebase.analytics"
version = "0.0.1"

fun KotlinNativeTarget.setUpFirebaseAnalytics() {
  compilations.getByName("main") {
    val firebaseAnalytics by cinterops.creating {
      packageName("cocoapods.FirebaseAnalytics")
      defFile(file("$projectDir/src/iosMain/c_interop/FirebaseAnalytics.def"))
      includeDirs("$projectDir/../sampleIosApp/Pods/FirebaseAnalytics")
      compilerOpts("-F$projectDir/../sampleIosApp/Pods/FirebaseAnalytics/Frameworks")
    }
  }
}

kotlin {
  android {
    publishLibraryVariants("debug", "release")
  }

  val buildForDevice = project.findProperty("kotlin.native.cocoapods.target") == "ios_arm"
  if (buildForDevice) {
    val iosArm64 = iosArm64("iOS64")
    val iosArm32 = iosArm32("iOS32")

    configure(listOf(iosArm64, iosArm32)) { setUpFirebaseAnalytics() }

    val iOSMain by sourceSets.creating
    sourceSets["iOS64Main"].dependsOn(iOSMain)
    sourceSets["iOS32Main"].dependsOn(iOSMain)
  } else {
    val iosX64 = iosX64("iOS")
    configure(listOf(iosX64)) { setUpFirebaseAnalytics() }
  }

//  ios()

  cocoapods {
    summary = "Firebase analytics project with CocoaPods dependencies"
    homepage = "https://github.com/"

//    pod("FirebaseAnalytics")
    podfile = project.file("../sampleIosApp/Podfile")
//    useLibraries()

//    ios.deploymentTarget = "13.5"
  }

  sourceSets {
    val commonMain by getting
    val commonTest by getting {
      dependencies {
        implementation(kotlin("test-common"))
        implementation(kotlin("test-annotations-common"))
      }
    }

    val androidMain by getting {
      dependencies {
        implementation("com.google.firebase:firebase-analytics-ktx:18.0.0")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.4.2")
      }
    }
    val androidTest by getting {
      dependencies {
        implementation(kotlin("test-junit"))
        implementation("junit:junit:4.13.1")
      }
    }

//    val iosMain by getting
  }
}

android {
  compileSdkVersion(30)
  sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
  defaultConfig {
    minSdkVersion(24)
    targetSdkVersion(30)
  }
}
