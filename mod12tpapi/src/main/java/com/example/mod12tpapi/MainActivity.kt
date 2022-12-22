package com.example.mod12tpapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    lateinit var vm:ProductVM;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vm = ViewModelProvider(this)[ProductVM::class.java]
        vm.fetchAllProduct()
        vm.liveDataArrayProduct.observe(this){ lsProducts ->
            if(lsProducts!= null){
                val adapter = ProductAdapter(lsProducts)
                val recyclerViewProducts = findViewById<RecyclerView>(R.id.recyclerViewProducts)
                recyclerViewProducts.layoutManager = LinearLayoutManager(this)
                recyclerViewProducts.adapter = adapter

            }
        }
    }
}