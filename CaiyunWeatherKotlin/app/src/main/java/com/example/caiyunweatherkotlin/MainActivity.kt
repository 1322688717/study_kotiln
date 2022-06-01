package com.example.caiyunweatherkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.baidu.location.LocationClient

class MainActivity : AppCompatActivity() {
    val life : Int = 1
    val end : Int = 99
    var love : Int = 0
    public lateinit var mLocationClient  : LocationClient
    private lateinit var myListener : MyLocationListener

    class MyLocationListener {

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        starLocation()
    }

    private fun starLocation() {
        mLocationClient.registerLocationListener(myListener)

    }


}