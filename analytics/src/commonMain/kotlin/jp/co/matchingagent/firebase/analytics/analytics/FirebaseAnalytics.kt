package jp.co.matchingagent.firebase.analytics.analytics

expect class FirebaseAnalytics {
  fun logEvent(
    name: String,
    block: FirebaseParametersBuilder.() -> Unit = {}
  )
}

expect class FirebaseParametersBuilder {
  fun param(key: String, value: Double)
  fun param(key: String, value: Long)
  fun param(key: String, value: String)
}
