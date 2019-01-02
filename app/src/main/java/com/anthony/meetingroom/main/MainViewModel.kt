package com.anthony.meetingroom.main

import androidx.databinding.ObservableField

class MainViewModel {
    var text = ObservableField<String>()

    init {
        text.set("Test")
    }
}