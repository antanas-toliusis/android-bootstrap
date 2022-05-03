package library.core.feature.presentation

import library.core.feature.domain.DomainResult

fun <T> DomainResult<T>.mapToSimpleUiState(): UIState<T> =
    when (this) {
        is DomainResult.Success -> UIState.Success(data)
        is DomainResult.Empty -> UIState.Empty()
        is DomainResult.ConnectionError -> UIState.ConnectionError()
    }
