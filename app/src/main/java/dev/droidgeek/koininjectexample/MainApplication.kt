package dev.droidgeek.koininjectexample

import android.app.Application
import dev.droidgeek.koininjectexample.di.moduleMeetup
import dev.droidgeek.koininjectexample.di.repositoryModule
import dev.droidgeek.koininjectexample.di.viewModelModule
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