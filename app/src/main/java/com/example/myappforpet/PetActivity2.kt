package com.example.myappforpet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

private lateinit var ImageView : ImageView
private lateinit var btnClean : Button
private lateinit var btnHunger : Button
private lateinit var btnHappy : Button

private lateinit var HappyTextView : TextView
private lateinit var HungerTextView : TextView
private lateinit var CleanTextView : TextView

var hunger = 10
var happy = 10
var clean = 10
class PetActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pet2)
        //imageView

        //buttons

        btnHunger = findViewById(R.id.BtnHunger)
        btnClean = findViewById(R.id.btnClean)
        btnHappy = findViewById(R.id.btnHappy)

        //textViews

        HappyTextView = findViewById(R.id.HappyTextView)
        HungerTextView = findViewById(R.id.HungerTextView)
        CleanTextView = findViewById(R.id.CleanTextView)

        // working the buttons


        hunger -= 1
        if (hunger < 0)
            hunger = 0
        happy++
        if (happy > 10)
            happy = 10

        HappyTextView.text = "Happiness :$happy"

        HungerTextView.text = "Hunger : $hunger"

        clean -= 1
        if (clean < 0)
            clean = 0
        hunger++
        if (hunger > 10)
            hunger = 10

        HungerTextView.text = "Hunger:$hunger"

        CleanTextView.text = "Clean : $clean"

        happy -= 1
        if (happy < 0)
            happy = 0
        clean++
        if (clean > 10)
            clean = 10

        HappyTextView.text = "Happiness : $happy"

        CleanTextView.text = "clean : $clean"
      }
    }










