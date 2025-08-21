plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("jvmLibrary") {
            id = "spot.jvm.library"
            implementationClass = "JvmConventionPlugin"
        }

        register("ktorApplication") {
            id = "spot.ktor.application"
            implementationClass = "KtorConventionPlugin"
        }

        register("ktorLibrary") {
            id = "spot.ktor.library"
            implementationClass = "KtorLibraryConventionPlugin"
        }

        register("ktorExposed") {
            id = "spot.ktor.exposed"
            implementationClass = "ExposedConventionPlugin"
        }

    }
}
