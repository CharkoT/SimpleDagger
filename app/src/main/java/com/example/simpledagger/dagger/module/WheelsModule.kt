package com.example.simpledagger.dagger.module

import com.example.simpledagger.Rims
import com.example.simpledagger.Tires
import com.example.simpledagger.Wheels
import dagger.Module
import dagger.Provides

@Module
abstract class WheelsModule {

    @Module
    companion object {

        @JvmStatic
        @Provides
        fun provideRims(): Rims {
            return Rims()
        }

        @JvmStatic
        @Provides
        fun provideTires(): Tires {
            val tires = Tires()
            tires.inflate()
            return tires
        }

        @JvmStatic
        @Provides
        fun provideWheels(tires: Tires, rims: Rims): Wheels {
            return Wheels(tires, rims)
        }
    }
}