package com.example.assignmentl12

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class blockchainDev : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blockchain_dev)

        val blockchainWebViewVariable = findViewById<WebView>(R.id.bcd)
        webViewSetUp(blockchainWebViewVariable)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(blockchainDeveloper : WebView){
        blockchainDeveloper.webViewClient = WebViewClient()

        blockchainDeveloper.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.simplilearn.com/tutorials/blockchain-tutorial/how-to-become-a-blockchain-developer")
        }
    }

}