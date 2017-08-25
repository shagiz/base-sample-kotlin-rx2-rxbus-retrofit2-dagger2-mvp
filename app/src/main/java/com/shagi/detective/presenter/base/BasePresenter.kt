package com.shagi.detective.presenter.base

import android.support.annotation.CallSuper
import com.shagi.detective.presenter.view.BaseView
import io.reactivex.disposables.CompositeDisposable

abstract class BasePresenter<V : BaseView> {
    val composite = CompositeDisposable()

    var view: V? = null

    @CallSuper
    open fun initView(view: V) {
        this.view = view;
    }

    @CallSuper
    open fun destroy(){
        view = null;
        if (!composite.isDisposed){
            composite.dispose()
        }
    }
}