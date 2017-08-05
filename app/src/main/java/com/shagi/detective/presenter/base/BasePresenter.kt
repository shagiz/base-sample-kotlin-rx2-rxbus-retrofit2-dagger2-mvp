package com.shagi.detective.presenter.base

import android.support.annotation.CallSuper
import com.shagi.detective.presenter.view.BaseView

abstract class BasePresenter<V : BaseView> {

    var view: V? = null

    @CallSuper
    open fun initView(view: V) {
        this.view = view;
    }
}