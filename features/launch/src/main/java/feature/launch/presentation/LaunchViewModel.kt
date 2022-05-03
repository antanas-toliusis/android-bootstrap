package feature.launch.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import javax.inject.Inject

private const val DELAY_IN_MILLISECONDS = 100L

@HiltViewModel
class LaunchViewModel @Inject constructor() : ViewModel() {

    val navigateToMainFeatureLiveData: LiveData<Unit> = liveData {
        delay(DELAY_IN_MILLISECONDS)
        emit(Unit)
    }
}
