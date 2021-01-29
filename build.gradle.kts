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
    classpath("com.android.tools.build:gradle:4.1.2")
    classpath("com.google.gms:google-services:4.3.5")
    classpath("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.5")
  }
}

allprojects {
  repositories {
    google()
    jcenter()
    mavenCentral()
//    mavenLocal()
  }
}

subprojects {
  group = "jp.co.matchingagent.firebase"
  version = "0.0.3"

  repositories {
//    mavenLocal()
    mavenCentral()
    google()
    jcenter()

    maven(url = "https://dl.bintray.com/matchingagent/maven/")
  }

  apply(plugin = "maven-publish")
  apply(plugin = "signing")

//  tasks.withType<Sign>().configureEach {
//    onlyIf { !project.gradle.startParameter.taskNames.contains("publishToMavenLocal") }
//  }

  configure<PublishingExtension> {
    repositories {
      maven {
        url = uri("https://api.bintray.com/maven/matchingagent/maven/firebase-analytics-kotlin/;publish=0;override=1")
        credentials {
          username = project.findProperty("bintrayUsername") as String? ?: System.getenv("bintrayUsername")
          password = project.findProperty("bintrayPassword") as String? ?: System.getenv("bintrayPassword")
        }
      }
    }

    publications.all {
      this as MavenPublication

      pom {
        name.set("firebase-kotlin-analytics")
        description.set("Firebase Analytics for Kotlin")
        url.set("https://github.com/MatchingAgent/firebase-analytics-kotlin")
        inceptionYear.set("2020")

        scm {
          url.set("https://github.com/MatchingAgent/firebase-analytics-kotlin")
          connection.set("scm:git:https://github.com/MatchingAgent/firebase-analytics-kotlin.git")
          developerConnection.set("scm:git:https://github.com/MatchingAgent/firebase-analytics-kotlin.git")
          tag.set("HEAD")
        }

        issueManagement {
          system.set("GitHub Issues")
          url.set("https://github.com/MatchingAgent/firebase-analytics-kotlin/issues")
        }

        developers {
          developer {
            name.set("Sato Shun")
            email.set("shun.sato1@gmail.com")
          }
        }

        licenses {
          license {
            name.set("The Apache Software License, Version 2.0")
            url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
          }
        }
      }
    }
  }
}
