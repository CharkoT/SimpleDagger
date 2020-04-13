package com.example.simpledagger

import android.app.Application
import com.example.simpledagger.dagger.AppComponent
import com.example.simpledagger.dagger.DaggerAppComponent

class SimpleDaggerApplication : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.create()

    }
}