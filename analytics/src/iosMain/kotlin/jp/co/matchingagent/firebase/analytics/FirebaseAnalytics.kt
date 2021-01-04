package jp.co.matchingagent.firebase.analytics

import cocoapods.FirebaseAnalytics.FIRAnalyticsMeta
import jp.co.matchingagent.firebase.Firebase
import cocoapods.FirebaseAnalytics.FIRAnalytics as fIRAnalytics

actual val Firebase.analytics: FirebaseAnalytics
  get() = FirebaseAnalytics(fIRAnalytics)

actual class FirebaseAnalytics(
  private val analytics: FIRAnalyticsMeta
) {
  actual fun logEvent(name: String) {
    logEvent(name, null)
  }

  actual fun logEvent(
    name: String,
    block: FirebaseParametersBuilder.() -> Unit
  ) {
    val builder = FirebaseParametersBuilder()
    builder.block()
    logEvent(name, builder.params)
  }

  fun logEvent(
    name: String,
    parameters: Map<String, *>?
  ) {
    analytics.logEventWithName(
      name = name,
      parameters = parameters?.toMap()
    )
  }

  actual fun setAnalyticsCollectionEnabled(enabled: Boolean) {
    analytics.setAnalyticsCollectionEnabled(enabled)
  }

  actual fun setUserId(id: String?) {
    analytics.setUserID(id)
  }

  actual fun setSessionTimeoutDuration(milliseconds: Long) {
    analytics.setSessionTimeoutInterval(milliseconds / 1000.0)
  }

  actual suspend fun getAppInstanceId(): String {
    return analytics.appInstanceID()!!
  }

  actual fun resetAnalyticsData() {
    analytics.resetAnalyticsData()
  }

  actual fun setUserProperty(name: String, value: String) {
    analytics.setUserPropertyString(name, value)
  }

  fun setScreenName(screenName :String?, screenClass: String?) {
    analytics.setScreenName(screenName, screenClass)
  }

  fun setDefaultEventParameters(parameters: Map<String, *>?) {
    analytics.setDefaultEventParameters(parameters?.toMap())
  }
}

actual class FirebaseParametersBuilder {
  internal val params: MutableMap<String, Any> = mutableMapOf()

  actual fun param(key: String, value: Double) {
    params[key] = value
  }

  actual fun param(key: String, value: Long) {
    params[key] = value
  }

  actual fun param(key: String, value: String) {
    params[key] = value
  }
}
