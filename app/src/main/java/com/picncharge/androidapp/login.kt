package com.picncharge.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {

    lateinit var btn_signup : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_signup = findViewById(R.id.btn_login_signup)

        btn_signup.setOnClickListener(){
            var go_to_signup = Intent(this, sign_up::class.java)
            startActivity(go_to_signup)
        }
    }
}