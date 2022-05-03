import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.addHiltDependencies(enableViewModel : Boolean) {
    implementation(Libs.HILT_GOOGLE_ANDROID)
    kapt(Libs.HILT_GOOGLE_ANDROID_COMPILER_CAPT)

    if(enableViewModel) {
        implementation(Libs.HILT_ANDROIDX_LIFECYCLE_VIEW_MODEL)
        kapt(Libs.HILT_ANDROIDX_COMPILER)
    }
}

private fun DependencyHandler.implementation(dependencyNotation: Any): Dependency? =
    add("implementation", dependencyNotation)

private fun DependencyHandler.kapt(dependencyNotation: Any): Dependency? =
    add("kapt", dependencyNotation)