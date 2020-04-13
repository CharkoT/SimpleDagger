package com.example.simpledagger.dagger.module

import com.example.simpledagger.Engine
import com.example.simpledagger.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine
}