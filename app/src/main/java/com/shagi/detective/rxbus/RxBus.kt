package com.shagi.detective.rxbus

import com.jakewharton.rxrelay2.PublishRelay
import com.shagi.detective.rxbus.event.BaseEvent
import io.reactivex.Observable

object RxBus {
    private val mRelay = PublishRelay.create<BaseEvent>()

    fun post(any: BaseEvent) {
        mRelay.accept(any)
    }

    val events: Observable<BaseEvent>
        get() = mRelay
}