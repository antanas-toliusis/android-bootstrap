package library.changethis.api.datasource

import com.remote.result.RemoteResult
import com.remote.safeApiCallToRemoteResult
import library.changethis.api.ApiService
import library.changethis.api.model.RemoteChnangeThis
import javax.inject.Inject

class RemoteChangeThisDataSource @Inject constructor(
    private val apiService: ApiService
) {

    suspend fun fetch(): RemoteResult<RemoteChnangeThis> =
        safeApiCallToRemoteResult {
            apiService.changeThis()
        }
}
