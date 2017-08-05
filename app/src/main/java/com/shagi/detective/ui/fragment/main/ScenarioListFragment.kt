package com.shagi.detective.ui.fragment.main

import android.os.Bundle
import com.shagi.detective.R
import com.shagi.detective.ui.fragment.BaseFragment

class ScenarioListFragment : BaseFragment() {

    override fun getLayout(): Int = R.layout.fragment_scenario_list

    companion object {
        fun newInstance(): ScenarioListFragment {
            val args = Bundle()

            val fragment = ScenarioListFragment()
            fragment.arguments = args
            return fragment
        }
    }
}
