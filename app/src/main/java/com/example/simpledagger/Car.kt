package com.example.simpledagger

import android.util.Log
import com.example.simpledagger.dagger.PerActivity
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(val wheels: Wheels, val engine: Engine, val driver: Driver) {

    private val TAG = "Class - CAR"

    fun drive() {
        Log.d(TAG, "Driving.....")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
        engine.start()

        Log.d(TAG, "${driver} driver ${this}")
    }
}