package com.picncharge.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class profile : AppCompatActivity() {

    lateinit var nav_home : Button
    lateinit var nav_map : Button
    lateinit var nav_profile : Button
    lateinit var nav_notification : Button

    lateinit var to_edit_profile : Button
    lateinit var to_add_car : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        nav_home = findViewById(R.id.btn_nav_home)
        nav_map = findViewById(R.id.btn_nav_map)
        nav_profile = findViewById(R.id.btn_nav_profile)
        nav_notification = findViewById(R.id.btn_nav_notification)

        to_edit_profile = findViewById(R.id.btn_profile_edit)
        to_add_car = findViewById(R.id.btn_profile_add_another_vehicle)

        to_add_car.setOnClickListener(){
            var go_to_add_vehicle = Intent(this, add_vehicle::class.java)
            startActivity(go_to_add_vehicle)
        }

        to_edit_profile.setOnClickListener(){
            var go_to_edit_profile = Intent(this, edit_profile::class.java)
            startActivity(go_to_edit_profile)
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