package com.fdegarne.database.interval

import com.fdegarne.data.model.Interval
import kotlinx.coroutines.flow.Flow

interface IntervalDataSource {
    fun getIntervals(): Flow<List<Interval>>
    suspend fun createInterval(interval: Interval): Long
    suspend fun deleteInterval(interval: Interval)
    suspend fun deleteIntervals(ids: List<Long>)
}