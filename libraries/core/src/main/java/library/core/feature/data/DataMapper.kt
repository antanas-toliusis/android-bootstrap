package library.core.feature.data

import com.remote.result.RemoteError
import com.remote.result.RemoteResult
import library.core.feature.domain.DomainResult

fun <I, O> RemoteResult<I>.mapToDomainResult(convert: (I) -> DomainResult<O>): DomainResult<O> =
    when (this) {
        is RemoteResult.Success -> convert(data)
        is RemoteResult.Failure -> {
            when (remoteError) {
                is RemoteError.ConnectionError -> DomainResult.ConnectionError<O>()
                is RemoteError.UnexpectedError -> DomainResult.Empty()
            }
        }
    }

fun <I, O> List<I>?.remoteSuccessMapper(convert: (List<I?>) -> List<O>): DomainResult<List<O>> =
    this?.let {
        convert(it).mapToDomainResultSuccessOrEmpty()
    } ?: DomainResult.Empty()

private fun <T> List<T>.mapToDomainResultSuccessOrEmpty(): DomainResult<List<T>> {
    return if (isEmpty()) {
        DomainResult.Empty()
    } else {
        DomainResult.Success(this)
    }
}
