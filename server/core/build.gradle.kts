plugins {
    alias(libs.plugins.spot.ktor.library)
}

dependencies {
    implementation(libs.ktor.serialization.kotlinx.json)
    implementation(libs.ktor.server.content.negotiation)
}