package feature.main.home.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import feature.main.home.data.repositories.HomeRepositoryImpl
import feature.main.home.domain.repositories.HomeRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindHomeRepository(repositoryImpl: HomeRepositoryImpl): HomeRepository
}
