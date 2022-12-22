package com.example.mod12apirest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import okhttp3.*
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val client = OkHttpClient()
        val requestDepartement = Request.Builder()
            .url("https://geo.api.gouv.fr/departements")
            .build()
        client.newCall(requestDepartement).enqueue(object : Callback {
            //Background Thread
            override fun onFailure(call: Call, e: IOException) {
                //loge
                Log.e(TAG, "onFailure: ${e.message}")
            }
            //Background Thread
            override fun onResponse(call: Call, response: Response) {
                val responseString = response.body?.string() ?: ""
                //manualDeserialization(responseString)
                val arrayDepartement = Gson().fromJson<Array<Departement>>(responseString)
                arrayDepartement.forEach {
                    Log.i(TAG, "onResponse: ${it?.code}:${it?.nom}")
                }
            }

        })
    }
    inline fun <reified T> Gson.fromJson(json: String) = fromJson<T>(json, object: TypeToken<T>() {}.type)

    fun manualDeserialization(res:String){
        val jsonArrayReponse = JSONArray(res)
        var listDepartement = ArrayList<Departement?>()
        for(i in 0 until jsonArrayReponse.length()){
            val departJson = jsonArrayReponse.getJSONObject(i)
            val departement = Departement(
                departJson.getString("nom"),
                departJson.getString("code"),
                departJson.getString("codeRegion"),
            )
            listDepartement.add(departement)
        }
        listDepartement.forEach {
            Log.i(TAG, "onResponse: ${it?.code}:${it?.nom}")
        }
    }
}