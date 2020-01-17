package dev.droidgeek.koininjectexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.droidgeek.koininjectexample.model.Meetup
import dev.droidgeek.koininjectexample.repository.MainRepository

class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    fun getMeetupData(): LiveData<Meetup> {

        val result = MutableLiveData<Meetup>()

        result.value = mainRepository.getObjectMeetup()

        return result
    }

}