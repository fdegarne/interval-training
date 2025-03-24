package com.fdegarne.database.session

import com.fdegarne.data.model.Session
import kotlinx.coroutines.flow.Flow

interface SessionDataSource {
    fun getSession(id: Long): Flow<Session>
    fun getSessions(): Flow<List<Session>>
    suspend fun createSession(session: Session)
    suspend fun deleteSession(session: Session)
    suspend fun deleteSessions(ids: List<Long>)
}