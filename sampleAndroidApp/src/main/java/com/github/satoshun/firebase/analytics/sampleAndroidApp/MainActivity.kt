package com.github.satoshun.firebase.analytics.sampleAndroidApp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.firebase.analytics.sample.shared.SharedFirebaseAnalytics

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    findViewById<View>(R.id.button).setOnClickListener {
      SharedFirebaseAnalytics.logEvent()
    }
  }
}
