package feature.main.home.data.repositories

import feature.main.home.domain.entities.ChangeThisEntity
import feature.main.home.domain.repositories.HomeRepository
import library.core.feature.domain.DomainResult
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor() : HomeRepository {

    override suspend fun getHome(): DomainResult<ChangeThisEntity> {
        TODO("Not yet implemented")
    }
}
