package com.example.simpledagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.simpledagger.dagger.module.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    lateinit var application: SimpleDaggerApplication

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        application = getApplication() as SimpleDaggerApplication
        application.component.getActivityComponent(DieselEngineModule(120)).inject(this)


//        DaggerActivityComponent.builder()
//            .horsePower(120)
//            .engineCapacitiy(14000)
//            .appComponent(application.component)
//            .build()
//            .inject(this)

        car1.drive()
        car2.drive()

    }
}
