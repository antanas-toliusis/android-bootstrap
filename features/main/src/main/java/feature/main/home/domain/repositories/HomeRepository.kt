package feature.main.home.domain.repositories

import feature.main.home.domain.entities.ChangeThisEntity
import library.core.feature.domain.DomainResult

interface HomeRepository {

    suspend fun getHome(): DomainResult<ChangeThisEntity>
}
