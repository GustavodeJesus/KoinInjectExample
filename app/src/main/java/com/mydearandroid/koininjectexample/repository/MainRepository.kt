package com.mydearandroid.koininjectexample.repository

import com.mydearandroid.koininjectexample.model.Meetup

class MainRepository (val meetup: Meetup) {

    fun getObjectMeetup() = meetup

}