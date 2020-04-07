package com.example.simpledagger.di

import com.example.simpledagger.Car
import dagger.Component

@Component
interface CarComponent {

    fun getCar(): Car
}