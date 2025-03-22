package com.fdegarne.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [],
    version = 1,
    exportSchema = true
)
internal abstract class IntervalsDatabase : RoomDatabase() {
}