package com.fdegarne.data.model

import com.fdegarne.database.entities.IntervalEntity
import com.fdegarne.model.Interval

fun Interval.asEntity(): IntervalEntity =
    IntervalEntity(
        id = this.id,
        time = this.time,
        sessionId = this.sessionId,
        orderInSession = this.orderInSession,
        description = this.description
    )