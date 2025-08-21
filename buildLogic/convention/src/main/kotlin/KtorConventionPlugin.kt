import com.spot.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaApplication
import org.gradle.kotlin.dsl.dependencies

class KtorConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("spot.jvm.library")

                apply("io.ktor.plugin")
                apply("org.jetbrains.kotlin.plugin.serialization")
            }

            dependencies {
                "implementation"(libs.findBundle("ktor").get())
            }

            extensions.configure(JavaApplication::class.java) {
                mainClass.set("io.ktor.server.netty.EngineMain")
            }
        }
    }
}