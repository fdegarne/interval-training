package com.fdegarne.model

import java.util.Date

data class Session (
    val id: Long = 0L,
    val date: Date,
    val title: String
)
