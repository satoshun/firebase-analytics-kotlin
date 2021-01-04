package jp.co.matchingagent.firebase.analytics

import jp.co.matchingagent.firebase.Firebase

expect val Firebase.analytics: FirebaseAnalytics

expect class FirebaseAnalytics {
  fun logEvent(name: String)

  fun logEvent(
    name: String,
    block: FirebaseParametersBuilder.() -> Unit
  )

  fun setAnalyticsCollectionEnabled(enabled: Boolean)

  fun setUserId(id: String?)

  fun setSessionTimeoutDuration(milliseconds: Long)

  suspend fun getAppInstanceId(): String

  fun resetAnalyticsData()

  fun setUserProperty(name: String, value: String)
}

expect class FirebaseParametersBuilder {
  fun param(key: String, value: Double)
  fun param(key: String, value: Long)
  fun param(key: String, value: String)
}
