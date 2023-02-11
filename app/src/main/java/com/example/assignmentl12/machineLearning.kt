package com.example.assignmentl12

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class machineLearning : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_machine_learning)

        val machinelearningWebViewVariable = findViewById<WebView>(R.id.mld)
        webViewSetUp(machinelearningWebViewVariable)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(machineLearningDeveloper : WebView){
        machineLearningDeveloper.webViewClient = WebViewClient()

        machineLearningDeveloper.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.geeksforgeeks.org/machine-learning/")
        }
    }

}