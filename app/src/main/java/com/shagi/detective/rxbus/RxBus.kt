package com.shagi.detective.rxbus

import com.jakewharton.rxrelay2.PublishRelay
import io.reactivex.Observable

object RxBus {
    private val mRelay = PublishRelay.create<Any>()

    fun post(any: Any) {
        mRelay.accept(any)
    }

    val events: Observable<Any>
        get() = mRelay
}