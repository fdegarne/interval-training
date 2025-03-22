package com.fdegarne.database.di

import android.content.Context
import androidx.room.Room
import com.fdegarne.database.IntervalsDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object DatabaseModule {
    @Provides
    @Singleton
    fun providesIntervalsDatabase(
        @ApplicationContext context: Context
    ): IntervalsDatabase = Room.databaseBuilder(
        context,
        IntervalsDatabase::class.java,
        "intervals-database"
    ).build()
}