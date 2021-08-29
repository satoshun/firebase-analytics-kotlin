import SwiftUI
import shared
import FirebaseAnalytics
import Firebase

func analyse() {
    // initialize
    FirebaseApp.configure()
    
    // use my library
    SharedFirebaseAnalytics.shared.setAnalyticsCollectionEnable()
    SharedFirebaseAnalytics.shared.logEvent()

    // use official FirebaseAnalytics
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
    