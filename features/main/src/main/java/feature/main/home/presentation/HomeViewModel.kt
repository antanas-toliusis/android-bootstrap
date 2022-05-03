package feature.main.home.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import feature.main.home.domain.usecases.ChangeThisUseCase
import kotlinx.coroutines.launch
import library.core.feature.presentation.UIState
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val changeThisUseCase: ChangeThisUseCase
) : ViewModel() {

    private var _liveData = MutableLiveData<UIState<List<Any>>>()
    val liveData: LiveData<UIState<List<Any>>> = _liveData

    init {
        viewModelScope.launch {
        }
    }
}
