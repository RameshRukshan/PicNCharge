package com.picncharge.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sign_up : AppCompatActivity() {

    lateinit var btn_createAccount : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btn_createAccount = findViewById(R.id.btn_signup_createaccount)

        btn_createAccount.setOnClickListener(){
            var go_to_signup_verification = Intent(this, Signup_Verification::class.java)
            startActivity(go_to_signup_verification)
        }
    }
}