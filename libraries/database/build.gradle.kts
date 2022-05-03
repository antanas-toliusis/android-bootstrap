plugins {
    id(Plugins.ANDROID_LIBRARY)
    id(Plugins.HILT)
    kotlin(Plugins.ANDROID)
    kotlin(Plugins.KAPT)
}

dependencies {
    implementation(Libs.ROOM_RUNTIME)
    implementation(Libs.ROOM_KTX)

    addHiltDependencies(false)
}
