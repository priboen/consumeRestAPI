package com.adrikhamid.consumerestapi.repository

import com.adrikhamid.consumerestapi.model.Kontak
import com.adrikhamid.consumerestapi.service_api.KontakService

interface KontakRepository {
    suspend fun getKontak(): List<Kontak>
}

class NetworkKontakRepository(
    private val kontakApiService: KontakService
): KontakRepository{
    override suspend fun getKontak(): List<Kontak> = kontakApiService.getKontak()
}