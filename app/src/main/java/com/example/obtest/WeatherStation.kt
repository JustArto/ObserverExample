package com.example.obtest

import android.os.Handler
import java.util.*
import kotlin.random.Random

class WeatherStation {
    private val people: MutableList<ManBehavior> = LinkedList()
    var degrees = 0

    fun addMan(manBehavior: ManBehavior){
        people.add(manBehavior)
    }
    fun removeMan(manBehavior: ManBehavior){
        people.remove(manBehavior)
    }

    fun updateWeather(){
        degrees = Random.nextInt(400)
        people.forEach(){
            it.getCloth(degrees = degrees)
        }
        val handler = Handler()
        handler.postDelayed({updateWeather()},2000)
    }

}