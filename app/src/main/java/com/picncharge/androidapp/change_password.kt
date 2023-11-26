package com.picncharge.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class change_password : AppCompatActivity() {

    lateinit var nav_home : Button
    lateinit var nav_map : Button
    lateinit var nav_profile : Button
    lateinit var nav_notification : Button

    lateinit var btn_change_password : Button
    lateinit var btn_change_password_cancel : Button

    lateinit var txt_current_password : TextView
    lateinit var txt_new_password : TextView
    lateinit var txt_new_password_confirm : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_password)

        nav_home = findViewById(R.id.btn_nav_home)
        nav_map = findViewById(R.id.btn_nav_map)
        nav_profile = findViewById(R.id.btn_nav_profile)
        nav_notification = findViewById(R.id.btn_nav_notification)

        btn_change_password = findViewById(R.id.btn_change_password)
        btn_change_password_cancel = findViewById(R.id.btn_change_password_cancel)

        txt_current_password = findViewById(R.id.txt_chang_password_old_password)
        txt_new_password = findViewById(R.id.txt_change_password_new_password)
        txt_new_password_confirm = findViewById(R.id.txt_change_password_reenter_new_password)


        btn_change_password.setOnClickListener(){
            var password = txt_current_password.text.toString()
            var new_password = txt_new_password.text.toString()
            var new_password_confirm = txt_new_password_confirm.text.toString()

            if(password.isEmpty()){
                txt_current_password.setError("Field Can't Be Empty")
            }else if(new_password.isEmpty()){
                txt_new_password.setError("Field Can't Be Empty")
            }else if(new_password_confirm.isEmpty()){
                txt_new_password_confirm.setError("Field Can't Be Empty")
            }else{
                if(password == ("test")){
                    if(new_password == new_password_confirm){
                        var go_to_profile = Intent(this, profile::class.java)
                        startActivity(go_to_profile)
                    }else{
                        txt_new_password.setError("New Password and Password Confirmation isn't match")
                        txt_new_password_confirm.setError("New Password and Password Confirmation isn't match")
                    }
                }else{
                    txt_current_password.setError("Invalid Password")
                }
            }
        }


        btn_change_password_cancel.setOnClickListener(){
            txt_current_password.setText("")
            txt_new_password_confirm.setText("")
            txt_new_password.setText("")

            txt_current_password.setError(null)
            txt_new_password_confirm.setError(null)
            txt_current_password.setError(null)
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