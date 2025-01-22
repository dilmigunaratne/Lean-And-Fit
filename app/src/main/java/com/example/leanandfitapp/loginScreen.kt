package com.example.leanandfitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class loginScreen : AppCompatActivity() {

    lateinit var username: EditText
    lateinit var password: EditText
    lateinit var loginBtn: Button
    lateinit var signHere: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        username = findViewById(R.id.editTextUsername)
        password = findViewById(R.id.editTextUsername)
        loginBtn = findViewById(R.id.loginBtn)
        signHere = findViewById(R.id.signhere)

        loginBtn.setOnClickListener({
            val intent = Intent(this@loginScreen, homeScreen::class.java)
            startActivity(intent)
        })

        signHere.setOnClickListener({
            val intent = Intent(this@loginScreen, signupScreen::class.java)
            startActivity(intent)
        })


    }
}