package dev.droidgeek.koininjectexample.repository

import dev.droidgeek.koininjectexample.model.Meetup

class MainRepository (val meetup: Meetup) {

    fun getObjectMeetup() = meetup

}