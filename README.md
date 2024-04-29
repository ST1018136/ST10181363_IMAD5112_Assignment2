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
In your code, it seems you're developing an Android app to manage a virtual pet. Let's break down what's happening:

1. **Variable Declarations**: You've declared three private variables `petHealth`, `petHunger`, and `petCleanliness` to store the health, hunger, and cleanliness levels of the pet, respectively.

2. **Activity Initialization**: In the `onCreate()` method, you're setting the content view to `activity_second.xml`, which presumably contains the UI elements for your virtual pet app.

3. **UI Element Retrieval**: You're retrieving references to various UI elements using `findViewById()`. You're getting references to buttons (`button`, `btnClean`, `btnHappy`), `EditText` fields (`editText`, `petCleanliness`, `petHealth`), and an `ImageView` (`imageView`).

4. **Button Click Listeners**: You're setting up click listeners for the "Feed" button (`button`) and the "Clean" button (`btnClean`). However, the logic inside these click listeners seems incomplete. For example, in the `button` click listener, you're subtracting 10 from `petHunger` but then immediately adding 5 to it. Similarly, in the `btnClean` click listener, you're adding 10 to `petHunger`.

5. **ImageView**: You're retrieving a reference to an `ImageView` (`imageView`), which suggests you might display the pet's image in your UI.

Overall, your code is a good start for building a virtual pet app, but you'll need to refine the logic inside the button click listeners to properly update the pet's hunger level and possibly the cleanliness level as well. Additionally, make sure to update the corresponding `EditText` fields to reflect the changes in the pet's stats.
