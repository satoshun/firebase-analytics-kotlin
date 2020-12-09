package jp.co.matchingagent.firebase.analytics.analytics

import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.analytics.ktx.logEvent
import com.google.firebase.ktx.Firebase

actual class FirebaseAnalytics {
  actual fun logEvent(
    name: String,
    block: FirebaseParametersBuilder.() -> Unit
  ) {
    Firebase.analytics.logEvent(name, block)
  }
}

actual object FirebaseAnalyticsParam {
  actual val ACHIEVEMENT_ID: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.ACHIEVEMENT_ID

  actual val AD_FORMAT: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT

  actual val AD_PLATFORM: String
    get() = com.google.firebase.analytics.FirebaseAnalytics.Param.AD_PLATFORM
}

actual typealias FirebaseParametersBuilder = com.google.firebase.analytics.ktx.ParametersBuilder
