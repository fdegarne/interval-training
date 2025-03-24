package com.fdegarne.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.fdegarne.database.interval.IntervalDao
import com.fdegarne.database.session.SessionDao
import com.fdegarne.database.entities.IntervalEntity
import com.fdegarne.database.entities.SessionEntity
import com.fdegarne.database.util.TimestampConverter

@Database(
    entities = [
        IntervalEntity::class,
        SessionEntity::class],
    version = 1,
    exportSchema = true
)
@TypeConverters(TimestampConverter::class)
internal abstract class IntervalsDatabase : RoomDatabase() {
    abstract fun intervalDao() : IntervalDao
    abstract fun sessionDao() : SessionDao
}