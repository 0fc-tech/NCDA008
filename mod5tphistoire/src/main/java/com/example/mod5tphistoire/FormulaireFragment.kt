package com.example.mod5tphistoire

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.mod5tphistoire.databinding.FragmentFormulaireBinding


class FormulaireFragment : Fragment() {
    lateinit var binding: FragmentFormulaireBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFormulaireBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonCreateStory.setOnClickListener {
            val histoire = Histoire(
                binding.editTextPrenom.text.toString(),
                binding.editTextLieu.text.toString(),
            )
            val direction = FormulaireFragmentDirections.actionFormulaireToHistoire(
                histoire
            )
            Navigation.findNavController(view).navigate(direction)
        }
    }

}