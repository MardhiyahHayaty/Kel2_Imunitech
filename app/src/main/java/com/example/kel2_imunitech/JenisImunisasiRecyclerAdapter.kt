package com.example.kel2_imunitech

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_layout_jenis_imunisasi.view.*

class JenisImunisasiRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<ListObjJenisImunisasi> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return JenisImunisasiViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.activity_layout_jenis_imunisasi,
            parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is JenisImunisasiViewHolder -> {
                holder.bind(items.get(position))
                /*holder.klik.setOnClickListener {
                    kalau_diklik(items.get(position))
                }*/
            }
        }
    }

    fun submitList(listJenisImunisasi: List<ListObjJenisImunisasi>) {
        items = listJenisImunisasi
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class JenisImunisasiViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val judul: TextView = itemView.jenis_imunisasi1
        val usia: TextView = itemView.nilai_usia_anak
        val manfaat: TextView = itemView.nilai_manfaat
        val efek : TextView = itemView.nilai_efek
        val klik: RelativeLayout = itemView.findViewById(R.id.rl_klik_jenis_imunisasi)

        fun bind(listObjJenisImunisasi: ListObjJenisImunisasi) {
            judul.setText(listObjJenisImunisasi.judul)
            usia.setText(listObjJenisImunisasi.usia)
            manfaat.setText(listObjJenisImunisasi.manfaat)
            efek.setText(listObjJenisImunisasi.efek)

        }

        /*fun kalau_diklik(get: ListObjJenisImunisasi) {
            val position: Int = adapterPosition
            Toast.makeText(itemView.context, "Kamu memilih : ${get.usia}",
            Toast.LENGTH_SHORT)
                .show()

            val intent = Intent(itemView.context, )
        }*/
    }
}