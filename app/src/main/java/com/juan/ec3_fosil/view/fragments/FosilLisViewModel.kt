package com.juan.ec3_fosil.view.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.juan.ec3_fosil.data.retrofilt.repository.FosilesRepository
import com.juan.ec3_fosil.data.retrofilt.response.ApiResponse
import com.juan.ec3_fosil.model.Fosil
import com.juan.ec3_fosil.model.getData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FosilLisViewModel: ViewModel() {
    val respository = FosilesRepository()
    val fosilList: MutableLiveData<List<Fosil>> = MutableLiveData<List<Fosil>>()

    fun getCouponList(){
        val data = getData()
        fosilList.value = data
    }

    fun getFosilFromService(){
        viewModelScope.launch(Dispatchers.IO){
            val response = respository.getFosiles()
            when(response){
                is ApiResponse.Error -> {
                    //colocar error

                }
                is ApiResponse.Success -> {
                    fosilList.postValue(response.data.fosiles)
                }
            }

        }
    }
}