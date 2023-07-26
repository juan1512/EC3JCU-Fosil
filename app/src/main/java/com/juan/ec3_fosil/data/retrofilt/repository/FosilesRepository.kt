package com.juan.ec3_fosil.data.retrofilt.repository

import com.juan.ec3_fosil.data.retrofilt.ServiceInstance
import com.juan.ec3_fosil.data.retrofilt.response.ApiResponse
import com.juan.ec3_fosil.data.retrofilt.response.FosilListRespons

class FosilesRepository {

    suspend fun getFosiles():ApiResponse<FosilListRespons>{
        return try
        {
            val response = ServiceInstance.getFosilService().getFosiles()
            ApiResponse.Success(response)
        }catch (e: java.lang.Exception){
            ApiResponse.Error(e)
        }
    }

}
