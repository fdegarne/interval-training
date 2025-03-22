package com.fdegarne.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.fdegarne.database.dao.IntervalDao
import com.fdegarne.database.dao.SessionDao
import com.fdegarne.database.entities.IntervalEntity

@Database(
    entities = [
        IntervalEntity::class],
    version = 1,
    exportSchema = true
)
internal abstract class IntervalsDatabase : RoomDatabase() {
    abstract fun intervalDao() : IntervalDao
    abstract fun sessionDao() : SessionDao
}