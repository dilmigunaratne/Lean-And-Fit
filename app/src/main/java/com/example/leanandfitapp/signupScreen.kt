package com.example.leanandfitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class signupScreen : AppCompatActivity() {

    lateinit var name : EditText
    lateinit var email : EditText
    lateinit var password: EditText
    lateinit var signupBtn : Button
    lateinit var loginHere : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_screen)

        name = findViewById(R.id.editTextName)
        email = findViewById(R.id.editTextEmail)
        password = findViewById(R.id.editTextPassword)
        signupBtn = findViewById(R.id.signupBtn)
        loginHere = findViewById(R.id.loginHere)

        signupBtn.setOnClickListener({
            val intent = Intent(this@signupScreen, homeScreen::class.java)
            startActivity(intent)
        })

        loginHere.setOnClickListener({
            val intent = Intent(this@signupScreen, loginScreen::class.java)
            startActivity(intent)
        })

    }
}