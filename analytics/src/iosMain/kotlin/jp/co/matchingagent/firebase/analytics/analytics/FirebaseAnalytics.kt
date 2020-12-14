package jp.co.matchingagent.firebase.analytics.analytics

import cocoapods.FirebaseAnalytics.kFIRParameterAchievementID
import cocoapods.FirebaseAnalytics.kFIRParameterAdFormat
import cocoapods.FirebaseAnalytics.kFIRParameterAdPlatform

actual class FirebaseAnalytics {
  actual fun logEvent(
    name: String,
    block: FirebaseParametersBuilder.() -> Unit
  ) {
    TODO()
  }
}

actual object FirebaseAnalyticsParam {
  actual val ACHIEVEMENT_ID: String get() = kFIRParameterAchievementID!!
  actual val AD_FORMAT: String get() = kFIRParameterAdFormat!!
  actual val AD_PLATFORM: String get() = kFIRParameterAdPlatform!!
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
