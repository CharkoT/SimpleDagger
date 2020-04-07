package com.example.simpledagger

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val engine: Engine, val wheels: Wheels) {

    private val TAG = "Class - CAR"

    fun drive() {
        Log.d(TAG, "Driving.....")
    }
}