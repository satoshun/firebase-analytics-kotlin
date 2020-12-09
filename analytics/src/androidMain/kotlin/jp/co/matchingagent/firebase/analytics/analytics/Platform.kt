package jp.co.matchingagent.firebase.analytics.analytics

actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}