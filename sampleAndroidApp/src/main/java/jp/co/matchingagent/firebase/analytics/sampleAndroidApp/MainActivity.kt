package jp.co.matchingagent.firebase.analytics.sampleAndroidApp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import jp.co.matchingagent.firebase.analytics.analytics.FirebaseAnalytics

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val analytics = FirebaseAnalytics()

    val tv: TextView = findViewById(R.id.button)
    tv.setOnClickListener {
      analytics.logEvent("clicked")
    }
  }
}
