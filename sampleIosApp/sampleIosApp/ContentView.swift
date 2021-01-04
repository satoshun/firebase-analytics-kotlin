import SwiftUI
import analytics
import FirebaseAnalytics
import Firebase

func analyse() {
    // initialize
    FirebaseApp.configure()
    Firebase().analytics.setAnalyticsCollectionEnabled(enabled: true)
    
    // use my library
    Firebase().analytics.logEvent(name: "ios_my_library")

    // official FirebaseAnalytics
    Analytics.logEvent("ios_official", parameters: nil)
}

struct ContentView: View {
    var body: some View {
        Text("Hello")
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
