package com.picncharge.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class edit_profile : AppCompatActivity() {


    lateinit var nav_home : Button
    lateinit var nav_map : Button
    lateinit var nav_profile : Button
    lateinit var nav_notification : Button

    lateinit var btn_convert_to_station : Button
    lateinit var btn_change_password : Button
    lateinit var btn_save : Button
    lateinit var btn_cancel : Button

    lateinit var new_first_name : EditText
    lateinit var new_laset_name : EditText
    lateinit var new_phone_number : EditText
    lateinit var new_email_address : EditText
    lateinit var new_location : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        nav_home = findViewById(R.id.btn_nav_home)
        nav_map = findViewById(R.id.btn_nav_map)
        nav_profile = findViewById(R.id.btn_nav_profile)
        nav_notification = findViewById(R.id.btn_nav_notification)

        btn_convert_to_station = findViewById(R.id.btn_profile_convert_to_station_profile)
        btn_change_password = findViewById(R.id.btn_profile_change_password)
        btn_cancel = findViewById(R.id.btn_profile_edit_cancel)
        btn_save = findViewById(R.id.btn_profile_edit_save)

        new_first_name = findViewById(R.id.txt_edit_profile_first_name)
        new_laset_name = findViewById(R.id.txt_edit_profile_last_name)
        new_phone_number = findViewById(R.id.txt_edit_profile_contact_number)
        new_email_address = findViewById(R.id.txt_edit_profile_email_address)
        new_location = findViewById(R.id.txt_edit_profile_location)

        btn_convert_to_station.setOnClickListener(){
            var go_to_station_profile_welcome = Intent(this, welcome2::class.java)
            startActivity(go_to_station_profile_welcome)
        }

        btn_cancel.setOnClickListener(){
            new_location.setText("")
            new_laset_name.setText("")
            new_first_name.setText("")
            new_phone_number.setText("")
            new_email_address.setText("")
        }

        btn_change_password.setOnClickListener(){
            var go_to_change_password = Intent(this, change_password::class.java)
            startActivity(go_to_change_password)
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