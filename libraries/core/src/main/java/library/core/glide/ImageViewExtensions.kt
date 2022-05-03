package library.core.glide

import android.net.Uri
import android.widget.ImageView

fun ImageView.load(uri: Uri) {
    GlideApp
        .with(this)
        .load(uri)
        .centerCrop()
        .into(this)
}
