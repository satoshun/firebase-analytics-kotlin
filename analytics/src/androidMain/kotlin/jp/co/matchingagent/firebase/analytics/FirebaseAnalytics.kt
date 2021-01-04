package jp.co.matchingagent.firebase.analytics

import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics.ConsentStatus
import com.google.firebase.analytics.FirebaseAnalytics.ConsentType
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.analytics.ktx.logEvent
import jp.co.matchingagent.firebase.Firebase
import kotlinx.coroutines.tasks.await
import com.google.firebase.analytics.FirebaseAnalytics as faFirebaseAnalytics
import com.google.firebase.ktx.Firebase as faFirebase

actual val Firebase.analytics: FirebaseAnalytics
  get() = FirebaseAnalytics(faFirebase.analytics)

actual class FirebaseAnalytics(
  private val analytics: faFirebaseAnalytics
) {
  actual fun logEvent(name: String) {
    logEvent(name, null)
  }

  actual fun logEvent(
    name: String,
    block: FirebaseParametersBuilder.() -> Unit
  ) {
    analytics.logEvent(name, block)
  }

  actual fun setAnalyticsCollectionEnabled(enabled: Boolean) {
    analytics.setAnalyticsCollectionEnabled(enabled)
  }

  actual fun setUserId(id: String?) {
    analytics.setUserId(id)
  }

  actual fun setSessionTimeoutDuration(milliseconds: Long) {
    analytics.setSessionTimeoutDuration(milliseconds)
  }

  actual suspend fun getAppInstanceId(): String {
    return analytics.appInstanceId.await()
  }

  actual fun resetAnalyticsData() {
    analytics.resetAnalyticsData()
  }

  actual fun setUserProperty(name: String, value: String) {
    analytics.setUserProperty(name, value)
  }

  fun logEvent(name: String, parameters: Bundle?) {
    analytics.logEvent(name, parameters)
  }

  fun setDefaultEventParameters(parameters: Bundle?) {
    analytics.setDefaultEventParameters(parameters)
  }

  fun getFirebaseInstanceId(): String {
    return analytics.firebaseInstanceId
  }

  fun setConsent(consentSettings: Map<ConsentType, ConsentStatus>) {
    analytics.setConsent(consentSettings)
  }
}

actual typealias FirebaseParametersBuilder = com.google.firebase.analytics.ktx.ParametersBuilder
