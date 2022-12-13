package com.example.mod4tprandom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextMin = findViewById<EditText>(R.id.editTextMin)
        val editTextMax = findViewById<EditText>(R.id.editTextMax)
        val buttonGenerate = findViewById<Button>(R.id.buttonGenerate)
        val textViewResult = findViewById<TextView>(R.id.textViewResultat)

        buttonGenerate.setOnClickListener {
            val minInt = editTextMin.text.toString().toIntOrNull()
            val maxInt = editTextMax.text.toString().toIntOrNull()
            if(minInt == null || maxInt == null){
                return@setOnClickListener;
            }
            if(maxInt < minInt){
                Log.e(TAG, "onCreate: " + "Borne Min > à borne max" )
                return@setOnClickListener;
            }
            val random = (minInt..maxInt).random()
            textViewResult.text = "Resultat : $random"
        }
    }
}