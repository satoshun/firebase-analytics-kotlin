import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
  id("com.android.library")

  kotlin("multiplatform")
  kotlin("native.cocoapods")
}

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
    publishLibraryVariants("release", "debug")
  }

//  val buildForDevice = project.findProperty("kotlin.native.cocoapods.target") == "ios_arm"
//  if (buildForDevice) {
//    val iosArm64 = iosArm64("iOS64")
//    val iosArm32 = iosArm32("iOS32")
//
//    configure(listOf(iosArm64, iosArm32)) { setUpFirebaseAnalytics() }
//
//    val iOSMain by sourceSets.creating
//    sourceSets["iOS64Main"].dependsOn(iOSMain)
//    sourceSets["iOS32Main"].dependsOn(iOSMain)
//  } else {
//    val iosX64 = iosX64("iOS")
//    configure(listOf(iosX64)) { setUpFirebaseAnalytics() }
//  }

  val iosTarget: (String, KotlinNativeTarget.() -> Unit) -> KotlinNativeTarget =
    if (System.getenv("SDK_NAME")?.startsWith("iphoneos") == true)
      ::iosArm64
    else
      ::iosX64

  iosTarget("ios") {}

//  ios()

  cocoapods {
    summary = "Firebase analytics project with CocoaPods dependencies"
    homepage = "https://github.com/"

    pod("FirebaseAnalytics", "~> 7.4.0")
    podfile = project.file("../sampleIosApp/Podfile")
//    useLibraries()

    ios.deploymentTarget = "13.5"
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
        implementation("com.google.firebase:firebase-analytics-ktx:18.0.2")
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
    minSdkVersion(21)
    targetSdkVersion(30)
  }
}

apply(from = rootProject.file("gradle/gradle-mvn-push.gradle"))
