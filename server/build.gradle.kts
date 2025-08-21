plugins {
    alias(libs.plugins.spot.ktor.application)

    application
}

dependencies {
    implementation(project(":server:core"))
    implementation(project(":database"))
}