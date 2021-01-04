package jp.co.matchingagent.firebase.analytics.sampleAndroidApp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import jp.co.matchingagent.firebase.Firebase
import jp.co.matchingagent.firebase.analytics.analytics

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    findViewById<View>(R.id.button).setOnClickListener {
      Firebase.analytics.logEvent("android")
    }
  }
}
