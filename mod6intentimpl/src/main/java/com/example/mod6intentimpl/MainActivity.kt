package com.example.mod6intentimpl

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted: Boolean ->
        if (!isGranted) return@registerForActivityResult;
        val intent = Intent(
            Intent.ACTION_CALL,
            Uri.parse("tel:0123456789")
        )
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonMap = findViewById<Button>(R.id.buttonMap)
        val buttonCall = findViewById<Button>(R.id.buttonCall)

        buttonMap.setOnClickListener {
            Intent(
                Intent.ACTION_VIEW,
                Uri.parse("geo:46.1599686,-0 .9622542")
            ).also {
                startActivity(it)
            }
        }
        buttonCall.setOnClickListener {
            requestPermissionLauncher.launch(Manifest.permission.CALL_PHONE)
        }

    }
}