import Modules.FEATURE_LAUNCH
import Modules.FEATURE_MAIN
import Modules.LIB_CORE

plugins {
    id(Plugins.ANDROID_APPLICATION)
    id(Plugins.HILT)
    kotlin(Plugins.ANDROID)
    kotlin(Plugins.KAPT)
}

android {
    defaultConfig {
        applicationId = Config.APPLICATION_ID
        versionCode = Config.VERSION_CODE
        versionName = Config.VERSION_NAME
    }
}

dependencies {
    implementation(project(FEATURE_LAUNCH))
    implementation(project(FEATURE_MAIN))

    implementation(project(LIB_CORE))
    addHiltDependencies(enableViewModel = true)
}
