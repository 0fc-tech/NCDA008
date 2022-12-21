package com.example.mod9tpqualiteair.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mod9tpqualiteair.R
import com.example.mod9tpqualiteair.data.QualiteAir
import com.example.mod9tpqualiteair.vm.ShowQualiteAirVM

private const val TAG = "ShowFragment"
class ShowFragment : Fragment() {
    val vm : ShowQualiteAirVM by viewModels { ShowQualiteAirVM.Factory }
    var isShowed = false
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_show, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView : RecyclerView = view.findViewById(R.id.recyclerViewQualiteAir)
        vm.fetchQualiteAir()
        vm.lsQualiteAir.observe(viewLifecycleOwner){ lsQualiteAir ->
            if(lsQualiteAir != null){
                recyclerView.layoutManager = LinearLayoutManager(view.context)
                recyclerView.adapter = QualiteAirAdapter(lsQualiteAir){
                    Toast.makeText(view.context, it.lieu, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}