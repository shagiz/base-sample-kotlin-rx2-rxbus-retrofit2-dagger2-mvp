package com.shagi.detective.ui.fragment.main

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.shagi.detective.App
import com.shagi.detective.R
import com.shagi.detective.presenter.MainPresenter
import com.shagi.detective.presenter.view.MainView
import com.shagi.detective.ui.fragment.BaseFragment

class MainFragment : BaseFragment<MainView, MainPresenter>(), MainView {

    override lateinit var presenter: MainPresenter


    override fun getLayout(): Int = R.layout.fragment_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = MainPresenter(this)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    }

    override fun onResume() {
        super.onResume()
        presenter.takeView(this)
    }

    companion object {
        fun newInstance(): MainFragment {

            val args = Bundle()

            val fragment = MainFragment()
            fragment.arguments = args
            return fragment
        }

        val TAG: String = "MainFragment"
    }
}

