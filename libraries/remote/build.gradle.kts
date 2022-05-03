import Libs.OK_HTTP_3
import Libs.OK_HTTP_LOGGING
import Libs.RETROFIT
import Libs.RETROFIT_CONVERTER_GSON
plugins {
    id(Plugins.KOTLIN)
}

dependencies {
    api(RETROFIT)
    api((RETROFIT_CONVERTER_GSON))
    api(OK_HTTP_3)
    api(OK_HTTP_LOGGING)
}
