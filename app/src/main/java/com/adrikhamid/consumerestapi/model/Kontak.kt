package com.adrikhamid.consumerestapi.model


import kotlinx.serialization.Serializable

@Serializable
data class Kontak(
    val id: Int,
    val nama: String,
    val nohp: String,
    val alamat: String
)
