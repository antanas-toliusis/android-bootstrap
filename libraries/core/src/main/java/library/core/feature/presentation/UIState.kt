package library.core.feature.presentation

sealed class UIState<out R> {
    data class Success<T>(val data: T) : UIState<T>()
    class ConnectionError<T> : UIState<T>()
    class Empty<T> : UIState<T>()
}
