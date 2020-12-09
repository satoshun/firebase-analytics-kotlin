package jp.co.matchingagent.firebase.analytics.analytics

actual class FirebaseAnalytics {
  actual fun logEvent(
    name: String,
    block: FirebaseParametersBuilder.() -> Unit
  ) {
    TODO()
  }
}

actual object FirebaseAnalyticsParam {
  actual val ACHIEVEMENT_ID: String get() = TODO()
  actual val AD_FORMAT: String get() = TODO()
  actual val AD_PLATFORM: String get() = TODO()
}

actual class FirebaseParametersBuilder {
  actual fun param(key: String, value: Double) {
    TODO()
  }

  actual fun param(key: String, value: Long) {
    TODO()
  }

  actual fun param(key: String, value: String) {
    TODO()
  }
}
