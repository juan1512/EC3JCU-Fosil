package com.juan.ec3_fosil.data.retrofilt

import com.juan.ec3_fosil.data.retrofilt.response.FosilListRespons
import retrofit2.http.GET

interface FosilService {
    @GET("fossils")
    suspend fun  getFosiles() :FosilListRespons
}