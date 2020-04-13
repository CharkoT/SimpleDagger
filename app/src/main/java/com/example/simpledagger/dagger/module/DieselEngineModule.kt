package com.example.simpledagger.dagger.module

import com.example.simpledagger.DieselEngine
import com.example.simpledagger.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(val horsePower: Int) {

    @Provides
    fun provideHorsePower(): Int {
        return horsePower
    }

    @Provides
    fun provideEngine(engine: DieselEngine): Engine {
        return engine
    }
}