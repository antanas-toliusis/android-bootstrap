package library.database.di

import android.content.Context
import androidx.room.Room
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import library.database.AppDao
import library.database.AppDatabase
import javax.inject.Singleton

class DatabaseModule {

    @InstallIn(SingletonComponent::class)
    object DatabaseModule {

        @Provides
        @Singleton
        fun provideAppDatabase(@ApplicationContext appContext: Context): AppDao =
            Room.databaseBuilder(appContext, AppDatabase::class.java, "app_database.db")
                .build()
                .appDao()
    }
}
