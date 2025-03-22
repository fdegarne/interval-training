package com.fdegarne.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "intervals")
data class IntervalEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val time: Long, // in milliseconds
    val sessionId: Long,
    val orderInSession: Int
)
