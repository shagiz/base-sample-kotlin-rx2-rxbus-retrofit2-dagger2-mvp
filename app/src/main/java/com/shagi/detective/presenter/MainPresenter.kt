package com.shagi.detective.presenter

import com.shagi.detective.presenter.base.BasePresenter
import com.shagi.detective.presenter.view.MainView

class MainPresenter(view: MainView) : BasePresenter<MainView>(view) {

    override fun takeView(view: MainView) {
        super.takeView(view)
    }

    override fun onViewAttached(view: MainView) {

    }
}