package com.fdegarne.data.model

import com.fdegarne.database.entities.SessionEntity
import com.fdegarne.model.Session

fun Session.asEntity(): SessionEntity =
    SessionEntity(
        id = this.id,
        date = this.date,
        title = this.title
    )