package com.example.simpledagger.dagger

import com.example.simpledagger.Car
import com.example.simpledagger.MainActivity
import com.example.simpledagger.dagger.module.DieselEngineModule
import com.example.simpledagger.dagger.module.PetrolEngineModule
import com.example.simpledagger.dagger.module.WheelsModule
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(
    modules = arrayOf(
        WheelsModule::class,
        DieselEngineModule::class
        //        PetrolEngineModule::class
    )
)
interface ActivityComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

//    @Component.Builder
//    interface Builder {
//
//        @BindsInstance
//        fun horsePower(@Named("horsePower") horsePower: Int): Builder
//
//        @BindsInstance
//        fun engineCapacitiy(@Named("engineCapacitiy") engineCapacitiy: Int): Builder
//
//        fun appComponent(component: AppComponent): Builder
//
//        fun build(): ActivityComponent
//    }

}
