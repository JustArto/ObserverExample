package com.example.obtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weatherStation = WeatherStation()
        weatherStation.addMan(Man("James","Bond"))
        weatherStation.addMan(Man("Tony","Stark"))

        weatherStation.updateWeather()
    }
}
