package com.juan.ec3_fosil.model

import com.google.gson.annotations.SerializedName

data class Fosil(
                 val urlImage: String,
                 val name: String,
                 val filename: String,
                 val museumopharase: String,
                 val price: String,
                 val expiresOn: String,

)

fun getData(): List<Fosil> =
    listOf(
        Fosil("","triserato", "ffsdg","50","descripcion.","sdf"),
        Fosil("","asd", "asd","50","descripcion.","sdf"),
        )
