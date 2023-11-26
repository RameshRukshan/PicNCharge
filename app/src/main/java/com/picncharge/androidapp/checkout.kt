package com.picncharge.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class checkout : AppCompatActivity() {

    lateinit var nav_home : Button
    lateinit var nav_map : Button
    lateinit var nav_profile : Button
    lateinit var nav_notification : Button

    lateinit var opt_cash_on_station : LinearLayout
    lateinit var opt_card : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        nav_home = findViewById(R.id.btn_nav_home)
        nav_map = findViewById(R.id.btn_nav_map)
        nav_profile = findViewById(R.id.btn_nav_profile)
        nav_notification = findViewById(R.id.btn_nav_notification)

        opt_cash_on_station = findViewById(R.id.sec_checkout_cash)
        opt_card = findViewById(R.id.sec_checkout_card)

        opt_card.setOnClickListener(){
            var go_to_card_details = Intent(this, addCard::class.java)
            startActivity(go_to_card_details)
        }

        opt_cash_on_station.setOnClickListener(){
            var go_to_view_reservation = Intent(this, view_reservation::class.java)
            startActivity(go_to_view_reservation)
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