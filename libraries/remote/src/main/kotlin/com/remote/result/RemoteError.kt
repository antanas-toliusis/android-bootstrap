package com.remote.result

sealed class RemoteError {
    data class ConnectionError(val msg: String) : RemoteError()
    data class UnexpectedError(val msg: String) : RemoteError()
}
