package com.shagi.detective.presenter.base

import android.support.annotation.CallSuper
import com.shagi.detective.presenter.view.BaseView
import io.reactivex.disposables.CompositeDisposable
import timber.log.Timber

abstract class BasePresenter<V : BaseView>(v: V) {
    private val composite = CompositeDisposable()

    var view: V?

    init {
        Timber.d("Presenter init with view = $v")
        view = v
    }

    @CallSuper
    open fun takeView(view: V) {
        this.view = view;
        onViewAttached(view)
    }

    open fun onViewAttached(view: V) {}

    @CallSuper
    open fun dropView() {
        view = null;
        if (!composite.isDisposed) {
            composite.dispose()
        }
    }
}