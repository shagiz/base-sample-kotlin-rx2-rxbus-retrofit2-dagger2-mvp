package com.shagi.detective.di.module

import android.content.Context
import com.shagi.detective.di.scope.AppScope
import dagger.Module
import dagger.Provides

@Module
class ContextModule(val context: Context) {

    @AppScope
    @Provides
    fun provideContext(): Context {
        return context;
    }
}
