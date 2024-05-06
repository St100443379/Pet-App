package com.example.myappforpet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startbutton: Button = findViewById<Button>(R.id.startbutton)
        startbutton.setOnClickListener {
        // start activity_main
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)

        }

    }
}