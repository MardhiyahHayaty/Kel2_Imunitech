package com.example.kel2_imunitech.RetrofitModelDataAnak.model

import com.google.gson.annotations.SerializedName

data class DataLokasi (
    @SerializedName("idLokasi")
    val idLokasi : Int?,
    @SerializedName("namaLokasi")
    val namaLokasi: String?,
    @SerializedName("jenisImunisasi")
    val jenisImunisasi: String?,
    @SerializedName("hari")
    val hari: String?,
    @SerializedName("waktu")
    val waktu: String?,
    @SerializedName("alamatImunisasi")
    val alamatImunisasi: String?
)