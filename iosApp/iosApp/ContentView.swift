import SwiftUI
import shared
import GRDB

struct ContentView: View {
    @State private var result: String = "Connecting..."

    var body: some View {
        VStack(spacing: 20) {
            Text("Breez SDK Dylib Test")
                .font(.title)
            ScrollView {
                Text(result)
                    .font(.body)
                    .padding()
                    .multilineTextAlignment(.leading)
            }
        }
        .task {
            let docsDir = FileManager.default.urls(for: .documentDirectory, in: .userDomainMask).first!.path
            result = try! await BreezTestKt.testConnect(storageDir: docsDir)
            print("GRDB version check: \(DatabaseQueue.self)")
        }
    }
}
