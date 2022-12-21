package com.example.mod10recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewConfiserie)
        val alConfiserie = arrayListOf(
            Confiserie("Caramel","caramélisé",5.0f,"Marron"),
            Confiserie("Schtroumpf Haribo","Sucré",3.5f,"Bleu"),
            Confiserie("Coca Haribo","coca",4.0f,"Marron et blanc"),
            Confiserie("Chamallow","moelleux",4.0f,"Blanc"),
            Confiserie("Frais tagada","fraise",5.0f,"Rouge"),
            Confiserie("Carambar","collant",4.5f,"marron"),
            Confiserie("Caramel","caramélisé",5.0f,"Marron"),
            Confiserie("Schtroumpf Haribo","Sucré",3.5f,"Bleu"),
            Confiserie("Coca Haribo","coca",4.0f,"Marron et blanc"),
            Confiserie("Chamallow","moelleux",4.0f,"Blanc"),
            Confiserie("Frais tagada","fraise",5.0f,"Rouge"),
            Confiserie("Carambar","collant",4.5f,"marron"),
            Confiserie("Caramel","caramélisé",5.0f,"Marron"),
            Confiserie("Schtroumpf Haribo","Sucré",3.5f,"Bleu"),
            Confiserie("Coca Haribo","coca",4.0f,"Marron et blanc"),
            Confiserie("Chamallow","moelleux",4.0f,"Blanc"),
            Confiserie("Frais tagada","fraise",5.0f,"Rouge"),
            Confiserie("Carambar","collant",4.5f,"marron"),
            Confiserie("Caramel","caramélisé",5.0f,"Marron"),
            Confiserie("Schtroumpf Haribo","Sucré",3.5f,"Bleu"),
            Confiserie("Coca Haribo","coca",4.0f,"Marron et blanc"),
            Confiserie("Chamallow","moelleux",4.0f,"Blanc"),
            Confiserie("Frais tagada","fraise",5.0f,"Rouge"),
            Confiserie("Carambar","collant",4.5f,"marron"),
            Confiserie("Caramel","caramélisé",5.0f,"Marron"),
            Confiserie("Schtroumpf Haribo","Sucré",3.5f,"Bleu"),
            Confiserie("Coca Haribo","coca",4.0f,"Marron et blanc"),
            Confiserie("Chamallow","moelleux",4.0f,"Blanc"),
            Confiserie("Frais tagada","fraise",5.0f,"Rouge"),
            Confiserie("Carambar","collant",4.5f,"marron"),
            Confiserie("Caramel","caramélisé",5.0f,"Marron"),
            Confiserie("Schtroumpf Haribo","Sucré",3.5f,"Bleu"),
            Confiserie("Coca Haribo","coca",4.0f,"Marron et blanc"),
            Confiserie("Chamallow","moelleux",4.0f,"Blanc"),
            Confiserie("Frais tagada","fraise",5.0f,"Rouge"),
            Confiserie("Carambar","collant",4.5f,"marron"),
            Confiserie("Caramel","caramélisé",5.0f,"Marron"),
            Confiserie("Schtroumpf Haribo","Sucré",3.5f,"Bleu"),
            Confiserie("Coca Haribo","coca",4.0f,"Marron et blanc"),
            Confiserie("Chamallow","moelleux",4.0f,"Blanc"),
            Confiserie("Frais tagada","fraise",5.0f,"Rouge"),
            Confiserie("Carambar","collant",4.5f,"marron"),
            Confiserie("Caramel","caramélisé",5.0f,"Marron"),
            Confiserie("Schtroumpf Haribo","Sucré",3.5f,"Bleu"),
            Confiserie("Coca Haribo","coca",4.0f,"Marron et blanc"),
            Confiserie("Chamallow","moelleux",4.0f,"Blanc"),
            Confiserie("Frais tagada","fraise",5.0f,"Rouge"),
            Confiserie("Carambar","collant",4.5f,"marron"),
            Confiserie("Caramel","caramélisé",5.0f,"Marron"),
            Confiserie("Schtroumpf Haribo","Sucré",3.5f,"Bleu"),
            Confiserie("Coca Haribo","coca",4.0f,"Marron et blanc"),
            Confiserie("Chamallow","moelleux",4.0f,"Blanc"),
            Confiserie("Frais tagada","fraise",5.0f,"Rouge"),
            Confiserie("Carambar","collant",4.5f,"marron"),
        )
        val adapter = ConfiserieAdapter(alConfiserie)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}