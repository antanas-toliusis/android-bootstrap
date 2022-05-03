package library.core.extensions.fragment

import android.content.Intent
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

fun <T : ViewBinding> Fragment.viewBinding(viewBindingFactory: (View) -> T) =
    FragmentViewBindingDelegate(this, viewBindingFactory)

fun Fragment.navigateTo(className: String, shouldFinishActivity: Boolean = false) {
    Intent().apply {
        setClassName(requireContext(), className)
        startActivity(this)
        if (shouldFinishActivity) {
            requireActivity().finish()
        }
    }
}
