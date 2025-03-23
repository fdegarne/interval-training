package com.fdegarne.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.fdegarne.database.entities.SessionEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SessionDao {
    @Query("SELECT * FROM sessions WHERE id = :id")
    fun getSessionEntity(id: Long): Flow<SessionEntity>

    @Query("SELECT * FROM sessions ORDER BY date DESC")
    fun getSessionEntities(): Flow<List<SessionEntity>>

    @Insert
    suspend fun insertSessionEntity(sessionEntity: SessionEntity): Long

    @Delete
    suspend fun deleteSessionEntity(sessionEntity: SessionEntity)

    @Query("DELETE FROM sessions WHERE id in (:ids)")
    suspend fun deleteSessionEntities(ids: List<Long>)
}