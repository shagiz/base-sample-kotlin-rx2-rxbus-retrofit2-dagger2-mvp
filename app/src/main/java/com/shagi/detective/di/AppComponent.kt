package com.shagi.detective.di

import android.content.Context
import com.shagi.detective.App
import com.shagi.detective.di.module.ContextModule
import com.shagi.detective.di.module.NetworkModule
import com.shagi.detective.di.scope.AppScope
import com.shagi.detective.model.AppService

import dagger.Component

@AppScope
@Component(modules = arrayOf(ContextModule::class, NetworkModule::class))
interface AppComponent {

    fun getContext(): Context

    fun getAppService(): AppService

    fun inject(app: App)

}
