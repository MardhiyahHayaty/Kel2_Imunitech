package com.example.kel2_imunitech

class SumberData {
    companion object {

        fun buatSetData() :ArrayList<ListObjJenisImunisasi>{
            val list = ArrayList<ListObjJenisImunisasi>()
            list.add(
                ListObjJenisImunisasi(
                    "Hepatitis B",
                    "< 24 Jam",
                    "Melindungi dari virus yang menyerang hati.",
                    "Demam, kemerahan, mual, nyeri."
                )
            )
            list.add(
                ListObjJenisImunisasi(
                    "Hepatitis B",
                    "0 - 1 Bulan",
                    "Melindungi dari virus yang menyerang hati.",
                    "Demam, kemerahan, mual, nyeri."
                )
            )
            list.add(
                ListObjJenisImunisasi(
                    "Hepatitis B",
                    "1 Bulan",
                    "Melindungi dari virus yang menyerang hati.",
                    "Demam, kemerahan, mual, nyeri."
                )
            )
            list.add(
                ListObjJenisImunisasi(
                    "Hepatitis B",
                    "1 Bulan",
                    "Melindungi dari virus yang menyerang hati.",
                    "Demam, kemerahan, mual, nyeri."
                )
            )
            return list

        }
    }
}