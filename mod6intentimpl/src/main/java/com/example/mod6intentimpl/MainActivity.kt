package com.example.mod6intentimpl

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Intent(
            Intent.ACTION_VIEW,
            Uri.parse("geo:46.1599686,-0 .9622542")
        ).also {
            startActivity(it)
        }
    }
}