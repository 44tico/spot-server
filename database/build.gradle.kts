plugins {
    alias(libs.plugins.spot.ktor.library)
}

dependencies {
    implementation(project(":database:core"))
}