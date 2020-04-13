package com.example.simpledagger

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(val horsePower: Int) : Engine {
    private val TAG = "Class - DieselEngine"

    override fun start() {
        Log.d(TAG, "Disel engine started!!! HorsePower : ${horsePower}")
    }
}