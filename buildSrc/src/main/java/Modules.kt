private const val FEATURES = ":features"
private const val LIBRARIES = ":libraries"

object Modules {
    const val FEATURE_LAUNCH = "$FEATURES:launch"
    const val FEATURE_MAIN = "$FEATURES:main"

    const val LIB_CORE = "$LIBRARIES:core"
    const val LIB_REMOTE = "$LIBRARIES:remote"
    const val LIB_DATABASE = "$LIBRARIES:database"
}