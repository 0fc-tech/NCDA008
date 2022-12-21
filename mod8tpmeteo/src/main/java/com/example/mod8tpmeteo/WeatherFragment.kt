package com.example.mod8tpmeteo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.findViewTreeLifecycleOwner
import androidx.navigation.Navigation
import com.example.mod8tpmeteo.databinding.FragmentWeatherBinding


class WeatherFragment : Fragment() {
    //TODO var pour dataBinding & ViewModel
    lateinit var binding: FragmentWeatherBinding
    lateinit var viewModel: WeatherViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //TODO Récupérer un dataBinding puis renvoyer le layout racine (constraintLayout)
        binding = FragmentWeatherBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[WeatherViewModel::class.java]
        binding.vm = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        //TODO répondre au clic des boutons et aller chercher température
        binding.buttonLyon.setOnClickListener {
            viewModel.getTemperature(viewModel.listCity.get("Lyon")!!)
        }
        binding.buttonLille.setOnClickListener {
            viewModel.getTemperature(viewModel.listCity.get("Lille")!!)
        }
        binding.buttonMarseille.setOnClickListener {
            viewModel.getTemperature(viewModel.listCity.get("Marseille")!!)
        }
        binding.buttonNiort.setOnClickListener {
            viewModel.getTemperature(viewModel.listCity.get("Niort")!!)
        }
        binding.buttonNantes.setOnClickListener {
            viewModel.getTemperature(viewModel.listCity.get("Nantes")!!)
        }
        binding.buttonRennes.setOnClickListener {
            viewModel.getTemperature(viewModel.listCity.get("Rennes")!!)
        }
        binding.textViewCity.setOnClickListener {
            viewModel.city.value?.let {
                    city ->
                val direction = WeatherFragmentDirections.actionWeatherToCity(city)
                Navigation.findNavController(it).navigate(direction)
            }
        }
    }


    fun sdklmshg(): Unit {
        val list = listOf("sdklj","sdf","sdklj","sdf","sdklj","sdf","sdklj","sdf")
        var a =""
        list.forEach { a+= it }
    }
}