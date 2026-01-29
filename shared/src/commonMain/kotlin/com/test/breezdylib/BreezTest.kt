package com.test.breezdylib

import breez_sdk_spark.ConnectRequest
import breez_sdk_spark.Network
import breez_sdk_spark.Seed
import breez_sdk_spark.connect
import breez_sdk_spark.defaultConfig

suspend fun testConnect(storageDir: String): String {
    return try {
        val config = defaultConfig(network = Network.REGTEST)
        val seed = Seed.Mnemonic(
            mnemonic = "abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon abandon about",
            passphrase = null,
        )
        val request = ConnectRequest(
            config = config,
            seed = seed,
            storageDir = storageDir,
        )
        val sdk = connect(request)
        "Connected successfully!\n\nConfig: $config"
    } catch (e: Exception) {
        "Connection error: ${e.message}"
    }
}
