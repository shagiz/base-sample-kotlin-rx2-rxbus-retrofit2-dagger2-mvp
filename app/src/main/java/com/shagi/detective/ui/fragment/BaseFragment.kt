package com.shagi.detective.ui.fragment

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shagi.detective.ui.LayoutOwner

abstract class BaseFragment : Fragment(), LayoutOwner {
    override final fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? = inflater.inflate(getLayout(), container, false)
}