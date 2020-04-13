package com.example.simpledagger

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    private val TAG = "Class - Remote"

    fun setListener(car: Car) {
        Log.d(TAG, "Remote Connected!!!")
    }

}