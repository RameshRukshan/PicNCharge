package com.picncharge.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class welcome2 : AppCompatActivity() {

    lateinit var btn_welcome_next : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome2)

        btn_welcome_next = findViewById(R.id.btn_welcome_next)

        btn_welcome_next.setOnClickListener(){
            var go_to_convert_to_station_profile = Intent(this, convert_to_station_profile::class.java)
            startActivity(go_to_convert_to_station_profile)
        }
    }
}