package com.pawan.koinexample.App


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.pawan.koinexample.R
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject


class MainActivity : AppCompatActivity() {


    val mainViewModel: MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.SayHelloInViewModel()

    }
}
