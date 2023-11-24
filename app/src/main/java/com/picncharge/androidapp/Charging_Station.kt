package com.picncharge.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Charging_Station : AppCompatActivity() {

    lateinit var nav_home : Button
    lateinit var nav_map : Button
    lateinit var nav_profile : Button
    lateinit var nav_notification : Button

    lateinit var reservation : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_charging_station)

        nav_home = findViewById(R.id.btn_nav_home)
        nav_map = findViewById(R.id.btn_nav_map)
        nav_profile = findViewById(R.id.btn_nav_profile)
        nav_notification = findViewById(R.id.btn_nav_notification)

        reservation = findViewById(R.id.btn_charging_station_port_reserve)

        reservation.setOnClickListener()
        {
            var go_to_reservation = Intent(this,reserve::class.java)
            startActivity(go_to_reservation)
        }

        nav_home.setOnClickListener(){
            var go_to_home = Intent(this, dashboard::class.java)
            startActivity(go_to_home)
        }

        nav_map.setOnClickListener(){
            var go_to_map = Intent(this, map::class.java)
            startActivity(go_to_map)
        }

        nav_profile.setOnClickListener(){
            var go_to_profile = Intent(this, profile::class.java)
            startActivity(go_to_profile)
        }

        nav_notification.setOnClickListener(){
            var go_to_notification = Intent(this, notification::class.java)
            startActivity(go_to_notification)
        }
    }
}