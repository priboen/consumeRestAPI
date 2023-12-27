package com.adrikhamid.consumerestapi.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.adrikhamid.consumerestapi.model.Kontak
import com.adrikhamid.consumerestapi.repository.KontakRepository

class InsertViewModel(private val kontakRepository: KontakRepository) : ViewModel() {
}

data class InsertUiState(
    val insertUiEvent: InsertUiEvent = InsertUiEvent()
)

data class InsertUiEvent(
    val id: Int = 0,
    val nama: String = "",
    val alamat: String = "",
    val nohp: String = ""
)

fun InsertUiEvent.toKontak(): Kontak = Kontak(
    id = id,
    nama = nama,
    alamat = alamat,
    nohp = nohp
)

fun Kontak.toUiStateKontak(): InsertUiState = InsertUiState(
    insertUiEvent = toInsertUiEvent()
)

fun Kontak.toInsertUiEvent(): InsertUiEvent = InsertUiEvent(
    id = id,
    nama = nama,
    alamat = alamat,
    nohp = nohp
)