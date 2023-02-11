package com.example.assignmentl12

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val androidcard = findViewById<CardView>(R.id.btnAndroid)
        val ioscard = findViewById<CardView>(R.id.btnIos)
        val webcard = findViewById<CardView>(R.id.btnWeb)
        val mlcard = findViewById<CardView>(R.id.btnMl)
        val blockchaincard = findViewById<CardView>(R.id.btnBlockchain)
        val web3card = findViewById<CardView>(R.id.btnWeb3)
        val contactmeButton = findViewById<Button>(R.id.btnContact)

        contactmeButton.setOnClickListener{
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0123456789")
            startActivity(dialIntent)
        }

        androidcard.setOnClickListener {
            //open a new activity
            intent = Intent(applicationContext, androidAppDev::class.java)
            startActivity(intent)
        }

        ioscard.setOnClickListener {
            //open a new activity
            intent = Intent(applicationContext, iosAppDev::class.java)
            startActivity(intent)
        }

        webcard.setOnClickListener {
            //open a new activity
            intent = Intent(applicationContext, webDev::class.java)
            startActivity(intent)
        }

        mlcard.setOnClickListener {
            //open a new activity
            intent = Intent(applicationContext, machineLearning::class.java)
            startActivity(intent)
        }

        blockchaincard.setOnClickListener {
            //open a new activity
            intent = Intent(applicationContext, blockchainDev::class.java)
            startActivity(intent)
        }

        web3card.setOnClickListener {
            //open a new activity
            intent = Intent(applicationContext, web3::class.java)
            startActivity(intent)
        }
//
//        comingsooncard.setOnClickListener {
//            //open a new activity
//            intent = Intent(applicationContext, androidAppDev::class.java)
//            startActivity(intent)
//        }

    }
}