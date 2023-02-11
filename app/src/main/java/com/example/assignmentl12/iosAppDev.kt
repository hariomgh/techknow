package com.example.assignmentl12

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class iosAppDev : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ios_app_dev)
        val iosWebViewVariable = findViewById<WebView>(R.id.iad)
        webViewSetUp(iosWebViewVariable)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(iosDeveloper : WebView){
        iosDeveloper.webViewClient = WebViewClient()

        iosDeveloper.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://developer.apple.com/tutorials/app-dev-training")
        }
    }

}