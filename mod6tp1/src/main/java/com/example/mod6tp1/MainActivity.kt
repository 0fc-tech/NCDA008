package com.example.mod6tp1

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.databinding.DataBindingUtil
import com.example.mod6tp1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var phoneNumber = ""
    val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted: Boolean ->
        if (!isGranted) return@registerForActivityResult;
        sendSms(phoneNumber)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.button.setOnClickListener {
            //TODO récupérer le numéro téléphone
            phoneNumber = binding.editTextPhone.text.toString()
            //TODO Demander Permission pour envoyer SMS
            requestPermissionLauncher.launch(Manifest.permission.SEND_SMS)
            //TODO Envoyer le SMS
        }
    }
    fun sendSms(phoneNumber : String){
        val intent = Intent(
            Intent.ACTION_SENDTO,
            Uri.parse("sms:$phoneNumber")
        )
        intent.putExtra("sms_body","sdklghklfgh")
        startActivity(intent)
    }
}