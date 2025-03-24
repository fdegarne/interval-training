package com.fdegarne.database.di

import com.fdegarne.database.IntervalsDatabase
import com.fdegarne.database.interval.IntervalDao
import com.fdegarne.database.session.SessionDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal object DaosModule {
    @Provides
    fun providesIntervalDao (
        intervalsDatabase: IntervalsDatabase
    ): IntervalDao = intervalsDatabase.intervalDao()

    @Provides
    fun providesSessionDao (
        intervalsDatabase: IntervalsDatabase
    ): SessionDao = intervalsDatabase.sessionDao()
}