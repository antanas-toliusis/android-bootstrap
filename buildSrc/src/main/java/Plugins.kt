object Plugins {
    private const val ANDROID_PLUGIN_VERSION = "7.1.3"
    private const val NAV_SAFE_ARGS_PLUGIN_VERSION = "2.4.2"
    private const val QUADRANT_VERSION = "1.7"

    const val ANDROID_APPLICATION = "com.android.application"
    const val ANDROID_LIBRARY = "com.android.library"
    const val ANDROID = "android"
    const val NAVIGATION_SAFEARGS = "androidx.navigation.safeargs"
    const val KAPT = "kapt"
    const val KOTLIN = "kotlin"
    const val HILT = "dagger.hilt.android.plugin"

    const val QUADRANT = "com.gaelmarhic.quadrant"
    const val QUADRANT_CLASSPATH = "gradle.plugin.com.gaelmarhic:quadrant:${QUADRANT_VERSION}"

    const val ANDROID_PLUGIN_CLASSPATH = "com.android.tools.build:gradle:${ANDROID_PLUGIN_VERSION}"
    const val NAV_SAFE_ARGS_PLUGIN_CLASSPATH = "androidx.navigation:navigation-safe-args-gradle-plugin:${NAV_SAFE_ARGS_PLUGIN_VERSION}"
    const val KOTLIN_PLUGIN_CLASSPATH = "org.jetbrains.kotlin:kotlin-gradle-plugin:${LibVersions.KOTLIN}"
    const val HILT_CLASSPATH = "com.google.dagger:hilt-android-gradle-plugin:${LibVersions.HILT_GOOGLE}"
    const val KT_LINT_PLUGIN = "org.jlleitschuh.gradle.ktlint"
}
