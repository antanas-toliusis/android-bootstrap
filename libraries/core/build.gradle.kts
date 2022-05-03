import Modules.LIB_REMOTE

plugins {
    id(Plugins.ANDROID_LIBRARY)
    id(Plugins.QUADRANT)
    id(Plugins.NAVIGATION_SAFEARGS)
    kotlin(Plugins.ANDROID)
    kotlin(Plugins.KAPT)
}

dependencies {
    api(project(LIB_REMOTE))

    api(Libs.CORE_KTX)
    api(Libs.APPCOMPAT)

    api(Libs.CONSTRAINT_LAYOUT)
    api(Libs.MATERIAL_DESIGN)

    api(Libs.NAV_FRAGMENT_KTX)
    api(Libs.NAV_UI_KTX)

    api(Libs.LIFECYCLE_CORE_KTX)
    api(Libs.LIFECYCLE_RUNTIME_KTX)
    api(Libs.LIFECYCLE_LIVEDATA_KTX)
    api(Libs.LIFECYCLE_VIEW_MODEL_KTX)
    api(Libs.LIFECYCLE_VIEW_MODEL_SAVED_STATE)
    api(Libs.LIFECYCLE_COMMON_JAVA_8)

    api(Libs.COROUTINES_ANDROID)
    api(Libs.COLLECTIONS_KTX)
    api(Libs.TIMBER_KT)

    implementation(Libs.GSON)

    implementation(Libs.GLIDE)
    kapt(Libs.GLIDE_COMPILER)

    addTestingDependencies()
}
