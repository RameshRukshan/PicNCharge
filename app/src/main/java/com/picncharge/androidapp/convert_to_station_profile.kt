package com.picncharge.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class convert_to_station_profile : AppCompatActivity() {

    lateinit var btn_continue : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_convert_to_station_profile)

        btn_continue = findViewById(R.id.btn_convert_to_station_continue)

        btn_continue.setOnClickListener(){
            var go_to_verification_station_profile = Intent(this, Verification_Station_Profile::class.java)
            startActivity(go_to_verification_station_profile)
        }
    }
}