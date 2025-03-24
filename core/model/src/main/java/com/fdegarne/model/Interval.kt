package com.fdegarne.model

data class Interval (
    val id: Long = 0L,
    val time: Long, // in milliseconds
    val sessionId: Long,
    val orderInSession: Int,
    val description: String?
)