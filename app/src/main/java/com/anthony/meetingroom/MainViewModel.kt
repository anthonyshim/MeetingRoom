package com.anthony.meetingroom

import android.databinding.ObservableField

class MainViewModel {
    var text = ObservableField<String>()

    init {
        text.set("Test")
    }
}