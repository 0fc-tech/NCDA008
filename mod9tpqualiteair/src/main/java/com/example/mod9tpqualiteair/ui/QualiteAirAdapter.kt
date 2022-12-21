package com.example.mod9tpqualiteair.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mod9tpqualiteair.data.QualiteAir
import com.example.mod9tpqualiteair.databinding.TemplateQualiteairLineBinding

class QualiteAirAdapter(val lsQUaliteAir : List<QualiteAir>, val listener: (qualiteAir:QualiteAir)-> Unit)
    : RecyclerView.Adapter<QualiteAirAdapter.QualiteAirVH>() {
    //Représente le conteneur réutilisé avec notre binding
    class QualiteAirVH(val binding : TemplateQualiteairLineBinding) : ViewHolder(binding.root)
    //On créé le viewHolder grâce à notre Binding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QualiteAirVH {
        //LayoutInflater => transforme votre layout XML en une Vue ou un Binding
        val binding = TemplateQualiteairLineBinding.inflate(
            LayoutInflater.from(parent.context), parent,false)
        return QualiteAirVH(binding)
    }
    //Déclenché à chaque fois que l'on doit afficher une donnée dans une ligne
    override fun onBindViewHolder(holder: QualiteAirVH, position: Int) {
        holder.binding.qualiteAir = lsQUaliteAir[position]
        holder.itemView.setOnClickListener {
            listener.invoke(lsQUaliteAir[position])
        }
    }
    //Retourne le nombre d'éléments dans ma liste (data source)
    override fun getItemCount(): Int = lsQUaliteAir.size

}