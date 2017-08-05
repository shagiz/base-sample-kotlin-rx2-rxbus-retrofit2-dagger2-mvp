package com.shagi.detective.ui

import android.support.annotation.LayoutRes

interface LayoutOwner {
    @LayoutRes
    fun getLayout(): Int
}