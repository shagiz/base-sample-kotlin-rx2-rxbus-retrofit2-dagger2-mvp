package com.shagi.detective.ui.fragment.main

import android.os.Bundle
import android.view.View
import com.shagi.detective.R
import com.shagi.detective.ui.activity.MainActivity
import com.shagi.detective.ui.adapter.MainPagerTabAdapter
import com.shagi.detective.ui.fragment.BaseFragment
import kotlinx.android.synthetic.main.fragment_main.*

class MainTabFragment : BaseFragment() {
    override fun getLayout(): Int = R.layout.fragment_main

    companion object {
        const val TAG = "MainTabFragment"

        fun newInstance(): MainTabFragment {
            val args = Bundle()

            val fragment = MainTabFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        val tabAdapter = MainPagerTabAdapter(fragmentManager, arrayOf("first", "second", "last"));
        pager.adapter = tabAdapter;
        tab_layout.setupWithViewPager(pager)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (activity as MainActivity).setUpToolbar(toolbar)
    }
}