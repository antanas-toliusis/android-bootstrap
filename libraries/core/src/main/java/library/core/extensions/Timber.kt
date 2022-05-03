package library.core.extensions

import com.github.ajalt.timberkt.Timber

fun logWithTimber(msg: Any, tag: String = "TIMBER_TAG") {
    Timber.tag(tag).d("$msg")
}
