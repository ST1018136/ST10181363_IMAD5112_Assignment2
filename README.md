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


package com.example.assignment2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class Second_Activity : AppCompatActivity() {

    private var petHealth = 100
    private var petHunger = 50
    private var petCleanliness = 50

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Get the button and text views
        val button = findViewById<Button>(R.id.btn_feed)
        val btnClean = findViewById<Button>(R.id.btn_clean)
        val btnHappy = findViewById<Button>(R.id.btn_happy)
        val editText = findViewById<EditText>(R.id.petHunger)
        val petCleanliness = findViewById<EditText>(R.id.petCleanliness)
        val petHealth = findViewById<EditText>(R.id.petHealth)
        val imageView = findViewById<ImageView>(R.id.pet_image)

        // Handle button clicks
        button.setOnClickListener{
            petHunger -= 10
            petHunger += 5

        }
        btnClean.setOnClickListener{
        petHunger += 10



        }

    }
}
