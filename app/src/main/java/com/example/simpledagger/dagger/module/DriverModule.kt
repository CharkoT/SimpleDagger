package com.example.simpledagger.dagger.module

import com.example.simpledagger.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class DriverModule {

    @Module
        companion object {
            @Provides
            @JvmStatic
            @Singleton
            fun provideDriver(): Driver {
                return Driver()
            }
    }


}