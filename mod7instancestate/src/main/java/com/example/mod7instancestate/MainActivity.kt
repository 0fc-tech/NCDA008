package com.example.mod7instancestate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mod7instancestate.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var textViewCounter : TextView
    lateinit var fabAdd : FloatingActionButton
    //var counter = 0
    lateinit var viewModel : CounterViewModel
    lateinit var dataBinding : ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this)[CounterViewModel::class.java]
        textViewCounter = findViewById(R.id.textViewCounter)
        fabAdd = findViewById(R.id.fabAdd)
        //On affiche le compteur dans le textView
        dataBinding.vm = viewModel
        dataBinding.lifecycleOwner = this
        fabAdd.setOnClickListener {
            viewModel.increment()
            //dataBinding.vm = viewModel
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