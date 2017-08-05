package com.shagi.detective.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.shagi.detective.ui.LayoutOwner

abstract class BaseActivity : AppCompatActivity(), LayoutOwner {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
    }
}