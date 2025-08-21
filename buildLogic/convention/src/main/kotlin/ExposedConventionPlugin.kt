import com.spot.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class ExposedConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("spot.ktor.library")
            }

            dependencies {
                "implementation"(libs.findBundle("exposed").get())
            }
        }
    }
}