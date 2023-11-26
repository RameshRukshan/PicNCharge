package com.picncharge.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class add_vehicle : AppCompatActivity() {

    lateinit var nav_home : Button
    lateinit var nav_map : Button
    lateinit var nav_profile : Button
    lateinit var nav_notification : Button

    // Define arrays of values for each spinner
    val batteryCapacityValues = arrayOf("100 kWh", "50 kWh", "75 kWh", "66 kWh", "40 kWh", "90 kWh", "42.2 kWh", "88 kWh")
    val chargingPortValues = arrayOf("Type 1 SEAJ1772", "Type 2 Mennekes", "CHAdeMO", "CCS", "Supercharger")
    val chargingTypeValues = arrayOf("Type A", "Type B", "Type C", "Type D", "Type E")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_vehicle)

        nav_home = findViewById(R.id.btn_nav_home)
        nav_map = findViewById(R.id.btn_nav_map)
        nav_profile = findViewById(R.id.btn_nav_profile)
        nav_notification = findViewById(R.id.btn_nav_notification)

        val spinnerBatteryCapacity: Spinner = findViewById(R.id.spinner_battery_capacity)
        val spinnerChargingPort: Spinner = findViewById(R.id.spinner_charging_port)
        val spinnerChargingType: Spinner = findViewById(R.id.spinner_charging_type)

// Create adapters for each spinner
        val adapterBatteryCapacity = ArrayAdapter(this, android.R.layout.simple_spinner_item, batteryCapacityValues)
        val adapterChargingPort = ArrayAdapter(this, android.R.layout.simple_spinner_item, chargingPortValues)
        val adapterChargingType = ArrayAdapter(this, android.R.layout.simple_spinner_item, chargingTypeValues)

// Set dropdown view resource for each adapter
        adapterBatteryCapacity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        adapterChargingPort.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        adapterChargingType.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

// Set adapters to the respective spinners
        spinnerBatteryCapacity.adapter = adapterBatteryCapacity
        spinnerChargingPort.adapter = adapterChargingPort
        spinnerChargingType.adapter = adapterChargingType


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