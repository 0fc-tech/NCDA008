package com.example.mod7instancestate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var textViewCounter : TextView
    lateinit var fabAdd : FloatingActionButton
    //var counter = 0
    lateinit var viewModel: CounterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[CounterViewModel::class.java]
        textViewCounter = findViewById(R.id.textViewCounter)
        fabAdd = findViewById(R.id.fabAdd)
        //On affiche le compteur dans le textView
        textViewCounter.text = viewModel.counter.toString()
        fabAdd.setOnClickListener {
            textViewCounter.text = viewModel.increment().toString()
        }
    }

    //override fun onSaveInstanceState(outState: Bundle) {
    //    super.onSaveInstanceState(outState)
    //    outState.putInt("counter", counter)
    //}

    //override fun onRestoreInstanceState(savedInstanceState: Bundle) {
    //    super.onRestoreInstanceState(savedInstanceState)
    //    counter = savedInstanceState.getInt("counter")
    //    textViewCounter.text = counter.toString()
    //}



}