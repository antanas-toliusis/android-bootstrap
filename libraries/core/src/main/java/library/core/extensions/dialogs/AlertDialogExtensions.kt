package library.core.extensions.dialogs

import android.content.Context
import androidx.annotation.StringRes
import androidx.appcompat.app.AlertDialog
import library.core.R

fun Context.showSingleBtnAlert(
    @StringRes title: Int? = null,
    @StringRes message: Int? = null,
    @StringRes positiveBtnText: Int? = null,
    onPositiveBtnClick: () -> Unit = {},
) {
    AlertDialog.Builder(this).run {
        message?.let(::setMessage)
        title?.let(::setTitle)
        setPositiveButton(positiveBtnText ?: R.string.ok) { _, _ ->
            onPositiveBtnClick()
        }
    }.show()
}

fun Context.showTwoBtnAlert(
    onPositiveBtnClick: () -> Unit = {},
    onNegativeBtnClick: () -> Unit = {},
    @StringRes title: Int? = null,
    @StringRes message: Int? = null,
    @StringRes positiveBtnText: Int? = null,
    @StringRes negativeBtnText: Int? = null,
) {
    AlertDialog.Builder(this).run {
        message?.let(::setMessage)
        title?.let(::setTitle)
        setPositiveButton(positiveBtnText ?: R.string.ok) { _, _ ->
            onPositiveBtnClick()
        }
        setNegativeButton(negativeBtnText ?: R.string.no) { _, _ ->
            onNegativeBtnClick()
        }
    }.show()
}
