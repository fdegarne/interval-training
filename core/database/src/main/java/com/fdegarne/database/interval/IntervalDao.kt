package com.fdegarne.database.interval

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.fdegarne.database.entities.IntervalEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface IntervalDao {
    @Query("SELECT * FROM intervals WHERE sessionId = :sessionId ORDER BY orderInSession")
    fun getIntervalEntities(sessionId: Long): Flow<List<IntervalEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertIntervalEntity(interval: IntervalEntity): Long

    @Delete
    suspend fun deleteIntervalEntity(interval: IntervalEntity)

    @Query("DELETE FROM intervals WHERE id in (:ids)")
    suspend fun deleteIntervalEntities(ids: List<Long>)
}