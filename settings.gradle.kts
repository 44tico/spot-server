pluginManagement {
    includeBuild("buildLogic")

    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "root"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include("server")
include("server:core")
include("database")
include("database")
include("database:core")