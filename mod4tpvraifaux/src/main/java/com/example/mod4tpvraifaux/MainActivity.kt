package com.example.mod4tpvraifaux

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mod4tpvraifaux.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    val listQR = listOf(
        QuestionReponse("Est-ce que la terre est plate?",true),
        QuestionReponse("Est-ce que les repitliens sont parmis nous?", true),
        QuestionReponse("As-ton marché sur la lune?",false),
        QuestionReponse("Est-ce qu'il ya des puces 5G dans le vaccin Moderna",true),
    )
    var index = 0
    var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.qr = listQR[index]
        binding.score = score

        binding.buttonTrue.setOnClickListener{
            checkUserResponse(true)
            if(index +1 > listQR.size -1){
                binding.buttonTrue.isEnabled = false
                binding.buttonFalse.isEnabled = false
                return@setOnClickListener;
            }
            index++
            binding.qr = listQR[index]

        }
        binding.buttonFalse.setOnClickListener{
            checkUserResponse(false)
            if(index +1 > listQR.size -1){
                binding.buttonFalse.isEnabled = false
                binding.buttonTrue.isEnabled = false
                return@setOnClickListener;
            }
            index++
            binding.qr = listQR[index]

        }
    }

    fun checkUserResponse(userReponse : Boolean){
        if(userReponse == listQR[index].reponse){
            binding.score = ++score
        }
    }
}