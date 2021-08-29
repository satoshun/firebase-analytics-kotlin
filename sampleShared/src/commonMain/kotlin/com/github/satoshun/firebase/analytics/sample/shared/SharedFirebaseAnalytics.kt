package com.github.satoshun.firebase.analytics.sample.shared

import com.github.satoshun.firebase.Firebase
import com.github.satoshun.firebase.analytics.analytics

object SharedFirebaseAnalytics {
  fun setAnalyticsCollectionEnable() {
    Firebase.analytics.setAnalyticsCollectionEnabled(true)
  }

  fun logEvent() {
    Firebase.analytics.logEvent(logName)
  }
}
