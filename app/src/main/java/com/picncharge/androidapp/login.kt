package com.picncharge.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class login : AppCompatActivity() {

    lateinit var btn_signup : Button
    lateinit var btn_login : Button
    lateinit var btn_cancel : Button
    lateinit var txt_username : EditText
    lateinit var txt_password : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_signup = findViewById(R.id.btn_login_signup)
        btn_login = findViewById(R.id.btn_login_login)
        btn_cancel = findViewById(R.id.btn_login_cancell)

        btn_signup.setOnClickListener(){
            var go_to_signup = Intent(this, sign_up::class.java)
            startActivity(go_to_signup)
        }

        btn_login.setOnClickListener(){

            txt_password = findViewById(R.id.txt_login_password)
            txt_username = findViewById(R.id.txt_login_username)

            val username = txt_username.text.toString()
            val password = txt_password.text.toString()


            if(username.isEmpty() or password.isEmpty()){

                if(username.isEmpty() and password.isEmpty()){
                    txt_password.setError("Password Can't be Empty")
                    txt_password.setBackgroundResource(R.drawable.errortxt)
                    txt_username.setError("Username Can't be Empty")
                    txt_username.setBackgroundResource(R.drawable.errortxt)
                }else if(username.isEmpty()){
                    txt_username.setError("Username Can't be Empty")
                    txt_username.setBackgroundResource(R.drawable.errortxt)
                }else if (password.isEmpty()) {
                    txt_password.setError("Password Can't be Empty")
                    txt_password.setBackgroundResource(R.drawable.errortxt)
                }

            }else{
                if(username == ("test") && password == ("test123")){
                    var go_to_dashboard = Intent(this,dashboard::class.java)
                    startActivity(go_to_dashboard)
                }else{
                    txt_password.setError("Invalid Credentials")
                    txt_password.setBackgroundResource(R.drawable.errortxt)
                    txt_username.setError("Invalid Credentials")
                    txt_username.setBackgroundResource(R.drawable.errortxt)
                }
            }

        }
        btn_cancel.setOnClickListener(){

            txt_password = findViewById(R.id.txt_login_password)
            txt_username = findViewById(R.id.txt_login_username)

            txt_username.setText("")
            txt_password.setText("")

            txt_password.setError(null)
            txt_username.setError(null)

            txt_password.setBackgroundResource(R.drawable.curved_background)
            txt_username.setBackgroundResource(R.drawable.curved_background)
        }
    }
}