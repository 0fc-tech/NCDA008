package com.example.mod9tpqualiteair.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.mod9tpqualiteair.dao.QualiteAirDao
import com.example.mod9tpqualiteair.data.QualiteAir
import com.example.mod9tpqualiteair.db.AppDatabase
import kotlinx.coroutines.launch

class ShowQualiteAirVM(val dao: QualiteAirDao) : ViewModel() {
    val lsQualiteAir = MutableLiveData<List<QualiteAir>>()

    fun fetchQualiteAir(){
        viewModelScope.launch {
            lsQualiteAir.value = dao.getAll()
        }
    }
    companion object {
        val Factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
                // Get the Application object from extras
                val application = checkNotNull(extras[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY])

                return ShowQualiteAirVM(
                    AppDatabase.getInstance(application.applicationContext).qualiteAirDao()
                ) as T
            }
        }
    }

}