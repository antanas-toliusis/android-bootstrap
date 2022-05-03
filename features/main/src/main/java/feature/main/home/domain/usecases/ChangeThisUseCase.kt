package feature.main.home.domain.usecases

import feature.main.home.domain.entities.ChangeThisEntity
import feature.main.home.domain.repositories.HomeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import library.core.feature.domain.DomainResult
import javax.inject.Inject

class ChangeThisUseCase @Inject constructor(
    private val repository: HomeRepository
) {

    suspend operator fun invoke(): DomainResult<ChangeThisEntity> =
        withContext(Dispatchers.IO) {
            repository.getHome()
        }
}
