plugins {
    kotlin("multiplatform")
    id("technology.breez.spark.kmp")
}

kotlin {
    listOf(
        iosArm64(),
        iosSimulatorArm64(),
        iosX64(),
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = false
        }
    }

    sourceSets {
        commonMain.dependencies {
            implementation("technology.breez.spark:breez-sdk-spark-kmp:0.0.0-local")
        }
    }
}
