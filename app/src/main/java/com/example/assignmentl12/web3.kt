package com.example.assignmentl12

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class web3 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web3)

        val web3WebViewVariable = findViewById<WebView>(R.id.w3d)
        webViewSetUp(web3WebViewVariable)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(web3Developer : WebView){
        web3Developer.webViewClient = WebViewClient()

        web3Developer.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.freecodecamp.org/news/what-is-web3/")
        }
    }

}