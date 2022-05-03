import Modules.LIB_REMOTE

plugins {
    id(Plugins.ANDROID_LIBRARY)
    id(Plugins.HILT)
    kotlin(Plugins.ANDROID)
    kotlin(Plugins.KAPT)
}

dependencies {
    api(project(LIB_REMOTE))
    addHiltDependencies(false)
}
