# Firebase Analytics Kotlin

Firebase Analytics Kotlin is a Kotlin Multiplatform library for Firebase Analytics. It supports only android and ios.

## Get started

Send a log from kotlin code.

```kotlin
import com.github.satoshun.firebase.analytics.analytics

Firebase.analytics.logEvent("android")
```

## Download

Download with a Gradle.

```groovy
dependencies {
  implementation "com.github.satoshun.firebase:analytics:1.5.0"
}
```

## Development

Download frameworks by Carthage.

```shell
cd analytics/src/nativeInterop/cinterop/
carthage update --use-xcframeworks
```
