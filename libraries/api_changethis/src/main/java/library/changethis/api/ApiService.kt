package library.changethis.api

import library.changethis.api.model.RemoteChnangeThis

interface ApiService {
    suspend fun changeThis(): RemoteChnangeThis
}
