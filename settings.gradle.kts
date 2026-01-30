pluginManagement {
    repositories {
        mavenLocal()
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://mvn.breez.technology/releases")
    }
}

dependencyResolutionManagement {
    repositories {
        mavenLocal()
        google()
        mavenCentral()
        maven("https://mvn.breez.technology/releases")
    }
}

rootProject.name = "BreezSdkDylibTest"
include(":shared")
include(":androidApp")
