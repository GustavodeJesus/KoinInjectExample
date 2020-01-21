package com.mydearandroid.koininjectexample

import android.app.Application
import com.mydearandroid.koininjectexample.di.moduleMeetup
import com.mydearandroid.koininjectexample.di.repositoryModule
import com.mydearandroid.koininjectexample.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(
                listOf(
                    moduleMeetup,
                    viewModelModule,
                    repositoryModule
                )
            )
            androidContext(this@MainApplication)
            androidFileProperties()
        }
    }

}