package com.picncharge.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.FirebaseApp

class MainActivity : AppCompatActivity() {

    lateinit var btn_continue : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FirebaseApp.initializeApp(this)


        btn_continue = findViewById(R.id.btn_welcome_continue)

        btn_continue.setOnClickListener(){
            var go_to_login = Intent(this, login::class.java)
            startActivity(go_to_login)
        }
    }
}