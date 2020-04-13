package com.example.simpledagger.dagger

import com.example.simpledagger.Driver
import com.example.simpledagger.dagger.module.DieselEngineModule
import com.example.simpledagger.dagger.module.DriverModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = arrayOf(
        DriverModule::class
    )
)
interface AppComponent {

    fun getActivityComponent(dieselEngineModule: DieselEngineModule) : ActivityComponent

//    fun getDriver(): Driver
}