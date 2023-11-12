package com.picncharge.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class sign_up : AppCompatActivity() {

    lateinit var btn_createAcc : Button
    lateinit var btn_cancel : Button

    lateinit var txt_first_name : TextView
    lateinit var txt_laste_name : TextView
    lateinit var txt_location : TextView
    lateinit var txt_nic :TextView
    lateinit var txt_email : TextView
    lateinit var txt_username : TextView
    lateinit var txt_password : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btn_createAcc=findViewById(R.id.btn_signup_createaccount)
        btn_cancel = findViewById(R.id.btn_signup_cancel)

        btn_createAcc.setOnClickListener(){
            var go_to_verification = Intent(this, Signup_Verification::class.java)
            startActivity(go_to_verification)
        }

        btn_cancel.setOnClickListener(){

            txt_first_name = findViewById(R.id.txt_signup_firstname)
            txt_laste_name = findViewById(R.id.txt_signup_lastname)
            txt_location = findViewById(R.id.txt_signup_locatin)
            txt_nic = findViewById(R.id.txt_signup_nicnumber)
            txt_email = findViewById(R.id.txt_signup_emailaddress)
            txt_username = findViewById(R.id.txt_signup_username)
            txt_password = findViewById(R.id.txt_signup_password)

            txt_first_name.setText("")
            txt_laste_name.setText("")
            txt_location.setText("")
            txt_nic.setText("")
            txt_email.setText("")
            txt_username.setText("")
            txt_password.setText("")
        }

    }
}