package com.example.assignmentl12

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class androidAppDev : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_app_dev)

        val androidWebViewVariable = findViewById<WebView>(R.id.aad)
        webViewSetUp(androidWebViewVariable)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(AndroidDeveloper : WebView){
        AndroidDeveloper.webViewClient = WebViewClient()

        AndroidDeveloper.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://developer.android.com/")
        }
    }
}