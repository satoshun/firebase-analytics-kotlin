import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
  id("com.android.library")

  kotlin("multiplatform")
  kotlin("native.cocoapods")
}

//fun KotlinNativeTarget.setUpFirebaseAnalytics() {
//  compilations.getByName("main") {
//    val firebaseAnalytics by cinterops.creating {
//      packageName("cocoapods.FirebaseAnalytics")
//      defFile(file("$projectDir/src/iosMain/c_interop/FirebaseAnalytics.def"))
//      includeDirs("$projectDir/../sampleIosApp/Pods/FirebaseAnalytics")
//      compilerOpts("-F$projectDir/../sampleIosApp/Pods/FirebaseAnalytics/Frameworks")
//    }
//  }
//}

kotlin {
  android {
    publishAllLibraryVariants()
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

//  val iosTarget: (String, KotlinNativeTarget.() -> Unit) -> KotlinNativeTarget =
//    if (System.getenv("SDK_NAME")?.startsWith("iphoneos") == true)
//      ::iosArm64
//    else
//      ::iosX64

//  iosTarget("ios") {}

//  ios()

  cocoapods {
    summary = "Firebase analytics for Kotlin"
    homepage = "https://github.com/satoshun/firebase-analytics-kotlin"

    ios.deploymentTarget = "12.0"
  }

  fun nativeTargetConfig(): KotlinNativeTarget.() -> Unit = {
    val nativeFrameworkPaths = listOf(
      projectDir.resolve("src/nativeInterop/cinterop/Carthage/Build/iOS")
    )

//  binaries {
//    getTest("DEBUG").apply {
//      linkerOpts(nativeFrameworkPaths.map { "-F$it" })
//      linkerOpts("-ObjC")
//    }
//  }

    compilations.getByName("main") {
      cinterops.create("FirebaseAnalytics") {
//      packageName("cocoapods.FirebaseAnalytics")
//      defFile(file("$projectDir/src/iosMain/c_interop/FirebaseAnalytics.def"))
//      includeDirs("$projectDir/../sampleIosApp/Pods/FirebaseAnalytics")

        compilerOpts(nativeFrameworkPaths.map { "-F$it" })
        extraOpts("-verbose")
      }
    }
  }

  ios(configure = nativeTargetConfig())
  iosSimulatorArm64(configure = nativeTargetConfig())

////  val iosX64 = iosX64("ios")
//  val iosArm64 = iosArm64("ios")
//////  val iosArm32 = iosArm32("ios32")
//////  configure(listOf(iosArm64, iosArm32, iosX64)) {
////  configure(listOf(iosX64, iosArm64)) {
//  configure(listOf(iosArm64)) {
//    setUpFirebaseAnalytics()
//    compilations["main"].source(sourceSets["iosMain"])
//  }

  sourceSets {
    all {
      languageSettings.apply {
        apiVersion = "1.5"
        languageVersion = "1.5"
        progressiveMode = true
      }
    }

    val commonMain by getting
    val commonTest by getting {
      dependencies {
        implementation(kotlin("test-common"))
        implementation(kotlin("test-annotations-common"))
      }
    }

    val androidMain by getting {
      dependencies {
        implementation("com.google.firebase:firebase-analytics-ktx:19.0.0")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.5.0")
      }
    }
    val androidTest by getting {
      dependencies {
        implementation(kotlin("test-junit"))
        implementation("junit:junit:4.13.2")
      }
    }

    val iosMain by getting
  }
}

android {
  compileSdk = 30
  sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")

  defaultConfig {
    minSdk = 21
    targetSdk = 30
  }
}

apply(from = rootProject.file("gradle/gradle-mvn-push.gradle"))
