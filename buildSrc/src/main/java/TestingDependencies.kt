import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import TestingDependencies.ANDROIDX_ARCH_CORE
import TestingDependencies.JUNIT
import TestingDependencies.KOTLINX_COROUTINES
import TestingDependencies.LIVE_DATA_TESTING_JRASKA
import TestingDependencies.MOCKITO_INLINE
import TestingDependencies.MOCKITO_KOTLIN_2_NHAARAM
import TestingDependencies.TRUTH_TEST

private object TestingVersions {
    const val JUNIT = "4.13.2"
    const val TRUTH = "1.1.3"
    const val ANDROIDX_ARCH_CORE = "2.1.0"
    const val LIVE_DATA_TESTING_JRASKA = "1.2.0"
    const val MOCKITO_KOTLIN_2_NHAARAM = "2.2.0"
    const val MOCKITO_INLINE = "4.5.1"
}

object TestingDependencies {
    const val JUNIT = "junit:junit:${TestingVersions.JUNIT}"
    const val TRUTH_TEST = "com.google.truth:truth:${TestingVersions.TRUTH}"

    const val ANDROIDX_ARCH_CORE = "androidx.arch.core:core-testing:${TestingVersions.ANDROIDX_ARCH_CORE}"
    const val KOTLINX_COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${LibVersions.COROUTINES}"
    const val LIVE_DATA_TESTING_JRASKA = "com.jraska.livedata:testing-ktx:${TestingVersions.LIVE_DATA_TESTING_JRASKA}"

    const val MOCKITO_KOTLIN_2_NHAARAM = "com.nhaarman.mockitokotlin2:mockito-kotlin:${TestingVersions.MOCKITO_KOTLIN_2_NHAARAM}"
    const val MOCKITO_INLINE = "org.mockito:mockito-inline:${TestingVersions.MOCKITO_INLINE}"
}

fun DependencyHandler.addTestingDependencies() {
    testImplementation(TRUTH_TEST)
    testImplementation(JUNIT)

    testImplementation(ANDROIDX_ARCH_CORE)
    testImplementation(KOTLINX_COROUTINES)
    testImplementation(LIVE_DATA_TESTING_JRASKA)

    testImplementation(MOCKITO_KOTLIN_2_NHAARAM)
    testImplementation(MOCKITO_INLINE)
}

private fun DependencyHandler.testImplementation(dependencyNotation: Any): Dependency? =
    add("testImplementation", dependencyNotation)

