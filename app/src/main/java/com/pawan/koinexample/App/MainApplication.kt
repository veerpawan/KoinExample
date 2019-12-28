package com.pawan.koinexample.App

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MainApplication : Application() {


    override fun onCreate() {
        super.onCreate()

        startKoin {

            androidLogger()
            androidContext(this@MainApplication)
            module { appModule }

        }

    }
}