package com.example.mod12tpapi

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import okhttp3.*
import java.io.IOException

private const val TAG = "ProductVM"
class ProductVM: ViewModel() {
    val liveDataArrayProduct = MutableLiveData<Array<Product>>()

    fun fetchAllProduct(){
        val client = OkHttpClient()
        val requestProducts = Request.Builder()
            .url("https://fakestoreapi.com/products")
            .build()
        client.newCall(requestProducts).enqueue(object : Callback{
            override fun onFailure(call: Call, e: IOException) {
                Log.i(TAG, "onFailure: ${e.message}")
            }

            override fun onResponse(call: Call, response: Response) {
                val responseString = response.body?.string() ?: ""
                liveDataArrayProduct.postValue(Gson().fromJson<Array<Product>>(responseString))
            }

        })
    }
    inline fun <reified T> Gson.fromJson(json: String) = fromJson<T>(json, object: TypeToken<T>() {}.type)

}