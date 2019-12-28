package com.pawan.koinexample.App

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule= module {

    single<HelloRepository> { HelloRepositoryImple() }
    viewModel { MainViewModel(get()) }



}