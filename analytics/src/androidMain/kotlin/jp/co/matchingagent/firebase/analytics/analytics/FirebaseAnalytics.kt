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

actual typealias FirebaseParametersBuilder = com.google.firebase.analytics.ktx.ParametersBuilder
