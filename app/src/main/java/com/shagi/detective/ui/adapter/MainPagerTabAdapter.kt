package com.shagi.detective.ui.adapter

import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
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