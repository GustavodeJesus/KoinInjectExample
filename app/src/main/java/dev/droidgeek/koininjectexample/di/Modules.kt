package dev.droidgeek.koininjectexample.di

import dev.droidgeek.koininjectexample.repository.MainRepository
import dev.droidgeek.koininjectexample.model.Meetup
import dev.droidgeek.koininjectexample.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


/**
 * Somente uma Instância é criada de Meetup
 * */
val moduleMeetup = module {
    single {
        Meetup(
            title = "Android Meetup - Uberlândia",
            message = getProperty("message"),
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