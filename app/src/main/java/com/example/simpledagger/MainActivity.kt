package com.example.simpledagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simpledagger.di.DaggerCarComponent

class MainActivity : AppCompatActivity() {

    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car = DaggerCarComponent.create().getCar()

    }
}
