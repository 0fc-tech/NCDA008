package com.example.mod8tpdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mod8tpdice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {
    lateinit var dataBinding: ActivityMainBinding
    lateinit var viewModel: DiceViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this)[DiceViewModel::class.java]
        dataBinding.vm = viewModel
        dataBinding.lifecycleOwner = this
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.button10 -> viewModel.launch(10)
            R.id.button12 -> viewModel.launch(12)
            R.id.button24 -> viewModel.launch(24)
            R.id.button32 -> viewModel.launch(32)
        }
        //dataBinding.vm = viewModel
    }
}