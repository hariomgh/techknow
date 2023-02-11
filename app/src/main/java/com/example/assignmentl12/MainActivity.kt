package com.example.assignmentl12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIntent = findViewById<Button>(R.id.btnLetsgo)

        btnIntent.setOnClickListener {
            //open a new activity
            intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}