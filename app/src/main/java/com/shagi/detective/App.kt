package com.shagi.detective

import android.app.Application
import com.facebook.stetho.Stetho
import com.shagi.detective.di.AppComponent
import com.shagi.detective.di.DaggerAppComponent
import com.shagi.detective.di.module.ContextModule
import timber.log.Timber

class App : Application() {

    companion object {
        lateinit var appComponent: AppComponent
            private set
    }

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())

        buildComponent()

        startStetho()
    }

    private fun startStetho() {
        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                        .build());
    }

    private fun buildComponent() {
        appComponent = DaggerAppComponent.builder()
                .contextModule(ContextModule(this))
                .build()

        appComponent.inject(this)
    }
}
