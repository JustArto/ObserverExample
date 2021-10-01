package com.example.obtest

import android.util.Log
import android.widget.Toast

class Man(val name:String, val surname: String):ManBehavior {

    private val TAG = Man::class.java.simpleName

    override fun getCloth(degrees: Int) {
        Log.e(TAG,"degrees $degrees")
    if (degrees > 200) {
        Log.e(TAG, "warm")
    }else{
            Log.e(TAG,"cold")
        }
    }
}
