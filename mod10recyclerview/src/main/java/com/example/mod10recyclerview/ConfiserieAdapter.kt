package com.example.mod10recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.mod10recyclerview.databinding.TemplateConfiserieLineBinding

//extends ou implements
class ConfiserieAdapter(val alConfiserie: ArrayList<Confiserie>):
        RecyclerView.Adapter<ConfiserieAdapter.ConfiserieVH>() {

    class ConfiserieVH(val binding: TemplateConfiserieLineBinding)
        : RecyclerView.ViewHolder(binding.root)

    //Doit créer un ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConfiserieVH {
        val binding = TemplateConfiserieLineBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return ConfiserieVH(binding)
    }
    //Doit faire correspondre une position dans l'arraylist à un ViewHolder
    override fun onBindViewHolder(holder: ConfiserieVH, position: Int) {
        holder.binding.confiserie = alConfiserie[position]
    }
    //récupère le nombre d'items à afficher
    override fun getItemCount() =alConfiserie.size
}