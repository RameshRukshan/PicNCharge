package com.picncharge.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import com.picncharge.androidapp.databinding.ActivityMainBinding
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class dashboard : AppCompatActivity(), OnMapReadyCallback {

    lateinit var nav_home : Button
    lateinit var nav_map : Button
    lateinit var nav_profile : Button
    lateinit var nav_notification : Button

    lateinit var nav_all_reservations : TextView
    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        nav_home = findViewById(R.id.btn_nav_home)
        nav_map = findViewById(R.id.btn_nav_map)
        nav_profile = findViewById(R.id.btn_nav_profile)
        nav_notification = findViewById(R.id.btn_nav_notification)
        nav_all_reservations = findViewById(R.id.btn_view_all_res_link)

        nav_all_reservations.setOnClickListener(){
            var go_to_my_reservations = Intent(this, my_reservations::class.java)
            startActivity(go_to_my_reservations)
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

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.dashmap) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Location of Colombo
        val colombo = LatLng(6.9271, 79.8612)

        // Add a marker at Colombo and move the camera
        mMap.addMarker(MarkerOptions().position(colombo).title("Marker in Colombo"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(colombo, 10f))
    }
}