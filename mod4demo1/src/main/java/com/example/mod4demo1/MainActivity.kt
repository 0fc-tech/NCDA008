package com.example.mod4demo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textViewLabel = findViewById<TextView>(R.id.textViewLabel)
        val editTextHowAreYou = findViewById<EditText>(R.id.editTextHowAreYou)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        val button = findViewById<Button>(R.id.button)

        textViewLabel.text = "Hello"
        editTextHowAreYou.setText("Comment allez-vous?")
        ratingBar.rating = 3f
        button.setOnClickListener {
            val valueEditText = editTextHowAreYou.text.toString()
            Snackbar.make(it,valueEditText,Snackbar.LENGTH_SHORT).show()
        }
    }
}