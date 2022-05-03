import Modules.LIB_CORE

plugins {
    id(Plugins.ANDROID_LIBRARY)
    id(Plugins.HILT)
    kotlin(Plugins.ANDROID)
    kotlin(Plugins.KAPT)
}

dependencies {
    implementation(project(LIB_CORE))

    addHiltDependencies(enableViewModel = true)
    addTestingDependencies()
}
