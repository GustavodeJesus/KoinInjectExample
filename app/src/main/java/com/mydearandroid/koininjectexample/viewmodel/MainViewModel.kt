package com.mydearandroid.koininjectexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mydearandroid.koininjectexample.model.Meetup
import com.mydearandroid.koininjectexample.repository.MainRepository

class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    fun getMeetupData(): LiveData<Meetup> {

        val result = MutableLiveData<Meetup>()

        result.value = mainRepository.getObjectMeetup()

        return result
    }

}