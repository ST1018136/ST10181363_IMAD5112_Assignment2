package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button= findViewById<Button>(R.id.btn_next)
        button.setOnClickListener{
            intent= Intent( this,Second_Activity::class.java)
            startActivity(intent)
        }

    }
}