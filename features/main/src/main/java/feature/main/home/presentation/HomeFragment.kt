package feature.main.home.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import feature.main.R
import feature.main.databinding.FragmentHomeBinding
import library.core.extensions.fragment.viewBinding
import library.core.feature.presentation.UIState

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private val viewModel by viewModels<HomeViewModel>()
    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeLiveData()
    }

    private fun observeLiveData() {
        viewModel.liveData.observe(viewLifecycleOwner) { uiState ->
            when (uiState) {
                is UIState.Success -> {
                }
                is UIState.ConnectionError -> {
                }
                is UIState.Empty -> {
                }
            }
        }
    }
}
