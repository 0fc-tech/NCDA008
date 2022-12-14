package com.example.mod4databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mod4databinding.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.textView.text = "Lion"
        binding.button.setOnClickListener {
            val editTextValue = binding.editText.text
            Snackbar.make(it,editTextValue,Snackbar.LENGTH_LONG).show()
        }
        val jeff = User("Jeff","Bezos",40,"Austin")
        binding.user = jeff
    }
}