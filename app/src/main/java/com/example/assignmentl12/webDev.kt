package com.example.assignmentl12

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class webDev : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_dev)

        val webdWebViewVariable = findViewById<WebView>(R.id.webd)
        webViewSetUp(webdWebViewVariable)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webDeveloper : WebView){
        webDeveloper.webViewClient = WebViewClient()

        webDeveloper.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.geeksforgeeks.org/web-development/")
        }
    }
}