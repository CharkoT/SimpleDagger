package com.example.simpledagger

import javax.inject.Inject

class Wheels @Inject constructor(private val tires: Tires, private val rims: Rims) {

}