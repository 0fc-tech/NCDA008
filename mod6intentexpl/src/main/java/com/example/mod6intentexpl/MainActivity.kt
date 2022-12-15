package com.example.mod6intentexpl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            //On démarre l'activity Target
            Intent(this,TargetActivity::class.java).also {
                it.putExtra("nom","Michael")
                startActivity(it)
            }

        }
    }
}