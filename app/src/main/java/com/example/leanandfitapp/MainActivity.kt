package com.example.leanandfitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.leanandfitapp.R.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        supportActionBar?.hide()

        android.os.Handler().postDelayed({
          val intent = Intent(this@MainActivity,loginScreen::class.java)
            startActivity(intent)
            finish()
        }, 3000)



    }
}