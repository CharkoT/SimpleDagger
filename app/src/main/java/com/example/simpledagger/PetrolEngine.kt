package com.example.simpledagger

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("horsePower") val horsePower: Int,
    @Named("engineCapacitiy") val engineCapacitiy: Int
) : Engine {
    private val TAG = "Class - PetrolEngine"

    override fun start() {
        Log.d(
            TAG,
            "Petrol engine started!!! HorsePower : ${horsePower},  Engine Capacitiy: ${engineCapacitiy}"
        )
    }

}