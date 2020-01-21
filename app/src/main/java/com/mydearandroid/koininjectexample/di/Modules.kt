package com.mydearandroid.koininjectexample.di

import com.mydearandroid.koininjectexample.R
import com.mydearandroid.koininjectexample.model.Meetup
import com.mydearandroid.koininjectexample.repository.MainRepository
import com.mydearandroid.koininjectexample.viewmodel.MainViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


/**
 * Somente uma Instância é criada de Meetup
 * */
val moduleMeetup = module {
    single {
        Meetup(
            title = androidContext().getString(R.string.app_title_meetup),
            message = androidContext().getString(R.string.app_message),
            idImage = R.drawable.img_meetup,
            url = getProperty("url")
        )
    }
}


/**
 * é criado uma nova instância a cada chamada.
 * */
val repositoryModule = module {

    factory { MainRepository(get()) }
}

/**
 * Istância criada exclusivamente para o ViewModel
 * */
val viewModelModule = module {
    viewModel { MainViewModel(get()) }
}