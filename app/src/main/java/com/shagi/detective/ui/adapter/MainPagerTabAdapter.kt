package com.shagi.detective.ui.adapter

import android.app.Fragment
import android.app.FragmentManager
import android.support.v13.app.FragmentPagerAdapter
import com.shagi.detective.ui.fragment.main.ScenarioListFragment

class MainPagerTabAdapter(fm: FragmentManager, val titles: Array<String>) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return ScenarioListFragment.newInstance()
    }

    override fun getCount(): Int = 3

    override fun getPageTitle(position: Int): CharSequence {
        return titles[position]
    }
}