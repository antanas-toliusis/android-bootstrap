import Modules.LIB_CORE

plugins {
    id(Plugins.ANDROID_LIBRARY)
    id(Plugins.HILT)
    kotlin(Plugins.ANDROID)
    kotlin(Plugins.KAPT)
}

dependencies {
    implementation(project(LIB_CORE))

    implementation(Libs.APP_STARTUP)
    implementation(Libs.TIMBER_KT)

    addHiltDependencies(enableViewModel = true)
    addTestingDependencies()
}
