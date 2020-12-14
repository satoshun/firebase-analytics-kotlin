import SwiftUI
import analytics
import FirebaseAnalytics

func analyse() {
    Analytics.logEvent("test", parameters: nil)
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
