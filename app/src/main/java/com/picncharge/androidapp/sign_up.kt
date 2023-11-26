package com.picncharge.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class sign_up : AppCompatActivity() {

    lateinit var btn_createAcc : Button
    lateinit var btn_cancel : Button

    lateinit var txt_first_name : TextView
    lateinit var txt_laste_name : TextView
    lateinit var txt_location : Spinner
    lateinit var txt_nic :TextView
    lateinit var txt_email : TextView
    lateinit var txt_username : TextView
    lateinit var txt_password : TextView

    val locations = arrayOf("Colombo", "Gampaha", "Kalutara", "Kandy", "Nuwara Eliya", "Galle", "Trincomalee")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        txt_location = findViewById(R.id.txt_signup_locatin)

        val LocationsAdaptor = ArrayAdapter(this, android.R.layout.simple_spinner_item, locations)
        LocationsAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        txt_location.adapter = LocationsAdaptor

        btn_createAcc=findViewById(R.id.btn_signup_createaccount)
        btn_cancel = findViewById(R.id.btn_signup_cancel)

        btn_createAcc.setOnClickListener(){

            txt_first_name = findViewById(R.id.txt_signup_firstname)
            txt_laste_name = findViewById(R.id.txt_signup_lastname)
            txt_location = findViewById(R.id.txt_signup_locatin)
            txt_nic = findViewById(R.id.txt_signup_nicnumber)
            txt_email = findViewById(R.id.txt_signup_emailaddress)
            txt_username = findViewById(R.id.txt_signup_username)
            txt_password = findViewById(R.id.txt_signup_password)

            var firstname = txt_first_name.text.toString()
            var lastname = txt_laste_name.text.toString()
            var email = txt_email.text.toString()
            var nic = txt_nic.text.toString()
            var username = txt_username.text.toString()
            var password = txt_password.text.toString()

            if(firstname.isEmpty()){
                txt_first_name.setError("First Name can't be empty")
                txt_first_name.setBackgroundResource(R.drawable.errortxt)
            }else if(lastname.isEmpty()){
                txt_laste_name.setError("Last Name Can't be empty")
                txt_laste_name.setBackgroundResource(R.drawable.errortxt)
            }else if (nic.isEmpty()){
                txt_nic.setError("NIC can't be empty")
                txt_nic.setBackgroundResource(R.drawable.errortxt)
            }else if(email.isEmpty()){
                txt_email.setError("Email can't be empty")
                txt_email.setBackgroundResource(R.drawable.errortxt)
            }else if(username.isEmpty()){
                txt_username.setError("Username Can't be Empty")
                txt_username.setBackgroundResource(R.drawable.errortxt)
            }else if (password.isEmpty()) {
                txt_password.setError("Password Can't be Empty")
                txt_password.setBackgroundResource(R.drawable.errortxt)
            }else{
                var go_to_verification = Intent(this, Signup_Verification::class.java)
                startActivity(go_to_verification)
            }
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
            txt_nic.setText("")
            txt_email.setText("")
            txt_username.setText("")
            txt_password.setText("")

            var go_back_to_login = Intent(this, login::class.java)
            startActivity(go_back_to_login)
        }

        btn_createAcc.setOnClickListener(){
            var go_to_signup_verification = Intent(this, Signup_Verification::class.java)
            startActivity(go_to_signup_verification)
        }
    }
}