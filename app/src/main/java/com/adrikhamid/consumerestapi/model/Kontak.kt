package com.adrikhamid.consumerestapi.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Kontak(
    val id: Int,
    val nama: String,
    val nohp: String,
    @SerialName("email")
    val alamat: String
)
