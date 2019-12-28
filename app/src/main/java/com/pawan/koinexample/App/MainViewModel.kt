package com.pawan.koinexample.App

import android.arch.lifecycle.ViewModel

class MainViewModel(private val helloRepository: HelloRepository) : ViewModel() {

    fun SayHelloInViewModel() {
        helloRepository.sayHello()
    }
}