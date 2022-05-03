package feature.launch.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.gaelmarhic.quadrant.QuadrantConstants.MAIN_ACTIVITY
import dagger.hilt.android.AndroidEntryPoint
import feature.launch.R
import library.core.extensions.fragment.navigateTo

@AndroidEntryPoint
class LaunchFragment : Fragment(R.layout.fragment_launch) {

    private val viewModel by viewModels<LaunchViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.navigateToMainFeatureLiveData.observe(viewLifecycleOwner) {
            navigateTo(MAIN_ACTIVITY, shouldFinishActivity = true)
        }
    }
}
