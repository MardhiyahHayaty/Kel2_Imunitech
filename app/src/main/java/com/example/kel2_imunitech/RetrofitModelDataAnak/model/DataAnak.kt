package com.example.kel2_imunitech.RetrofitModelDataAnak.model

import com.google.gson.annotations.SerializedName

data class DataAnak (
    @SerializedName("idAnak")
    val idAnak : Int?,
    @SerializedName("namaAnak")
    val namaAnak: String?,
    @SerializedName("jenisKelamin")
    val jenisKelamin: String?,
    @SerializedName("tanggalLahir")
    val tanggalLahir: String?,
    @SerializedName("alamatAnak")
    val alamatAnak: String?
)