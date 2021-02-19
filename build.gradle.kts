buildscript {
  repositories {
    gradlePluginPortal()
    jcenter()
    google()
    mavenCentral()
  }
  dependencies {
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30")
    classpath("com.android.tools.build:gradle:4.1.2")
    classpath("com.google.gms:google-services:4.3.5")
  }
}

allprojects {
  repositories {
    google()
    jcenter()
    mavenCentral()
  }
}

fun getRepositoryUsername() =
  if (hasProperty("SONATYPE_NEXUS_USERNAME")) properties["SONATYPE_NEXUS_USERNAME"] as String else ""

fun getRepositoryPassword() =
  if (hasProperty("SONATYPE_NEXUS_PASSWORD")) properties["SONATYPE_NEXUS_PASSWORD"] as String else ""

subprojects {
  group = "com.github.satoshun.firebase"
  version = "0.0.4"

  repositories {
    mavenCentral()
    google()
    jcenter()
  }

  apply(plugin = "maven-publish")
  apply(plugin = "signing")

  configure<PublishingExtension> {
    repositories {
      maven {
        url = uri("https://oss.sonatype.org/service/local/staging/deploy/maven2/")
        credentials {
          username = getRepositoryUsername()
          password = getRepositoryPassword()
        }
      }
    }

    publications.all {
      this as MavenPublication

      pom {
        name.set("firebase-kotlin-analytics")
        description.set("Firebase Analytics for Kotlin")
        url.set("https://github.com/satoshun/firebase-analytics-kotlin")
        inceptionYear.set("2021")

        scm {
          url.set("https://github.com/satoshun/firebase-analytics-kotlin")
          connection.set("scm:git:https://github.com/satoshun/firebase-analytics-kotlin.git")
          developerConnection.set("scm:git:https://github.com/satoshun/firebase-analytics-kotlin.git")
          tag.set("HEAD")
        }

        issueManagement {
          system.set("GitHub Issues")
          url.set("https://github.com/satoshun/firebase-analytics-kotlin/issues")
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
