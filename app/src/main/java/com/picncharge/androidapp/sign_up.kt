package com.picncharge.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference


class sign_up : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var firstnameEditText: EditText
    private lateinit var lastnameEditText: EditText
    private lateinit var locationEditText: EditText
    private lateinit var nicEditText: EditText
    private lateinit var cancelButton: Button
    private lateinit var signUpButton: Button

    private lateinit var databaseReference: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        usernameEditText = findViewById(R.id.txt_signup_username)
        emailEditText = findViewById(R.id.txt_signup_emailaddress)
        passwordEditText = findViewById(R.id.txt_signup_password)
        firstnameEditText = findViewById(R.id.txt_signup_firstname)
        lastnameEditText = findViewById(R.id.txt_signup_lastname)
        locationEditText = findViewById(R.id.txt_signup_locatin)
        nicEditText = findViewById(R.id.txt_signup_nicnumber)
        cancelButton = findViewById(R.id.btn_signup_cancel)
        signUpButton = findViewById(R.id.btn_signup_createaccount)

        databaseReference = FirebaseDatabase.getInstance().reference.child("users")

        signUpButton.setOnClickListener {
            val firstname = firstnameEditText.text.toString()
            val lastname = lastnameEditText.text.toString()
            val location = locationEditText.text.toString()
            val nic = nicEditText.text.toString()
            val email = emailEditText.text.toString()
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()
            val user = User(firstname, lastname, location, nic, email, username, password)
            saveUserToFirebase(user)

        }

        cancelButton.setOnClickListener {
            firstnameEditText.setText("")
            lastnameEditText.setText("")
            locationEditText.setText("")
            nicEditText.setText("")
            emailEditText.setText("")
            usernameEditText.setText("")
            passwordEditText.setText("")

        }
    }

    private fun saveUserToFirebase(user: User) {
        val userId = databaseReference.push().key // Create a unique key for the user
        userId?.let {
            databaseReference.child(it).setValue(user)
        }
    }
}
