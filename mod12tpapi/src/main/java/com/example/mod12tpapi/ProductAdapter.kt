package com.example.mod12tpapi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mod12tpapi.databinding.TemplateProductLineBinding
import com.squareup.picasso.Picasso

class ProductAdapter(val arrayProducts : Array<Product>):RecyclerView.Adapter<ProductAdapter.ProductVH>() {
    class ProductVH(val binding: TemplateProductLineBinding)
        : RecyclerView.ViewHolder(binding.root)

    //Doit créer un ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductVH {
        val binding = TemplateProductLineBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return ProductVH(binding)
    }
    //Doit faire correspondre une position dans l'arraylist à un ViewHolder
    override fun onBindViewHolder(holder: ProductVH, position: Int) {
        holder.binding.product = arrayProducts[position]
        Picasso.get().load(arrayProducts[position].image).into(holder.binding.imageViewProduct)
    }
    //récupère le nombre d'items à afficher
    override fun getItemCount() =arrayProducts.size
}