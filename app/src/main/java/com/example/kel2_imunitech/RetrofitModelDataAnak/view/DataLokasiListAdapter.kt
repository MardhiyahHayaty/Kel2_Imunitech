package com.example.kel2_imunitech.RetrofitModelDataAnak.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions
import com.example.kel2_imunitech.R
import com.example.kel2_imunitech.RetrofitModelDataAnak.model.DataAnak
import com.example.kel2_imunitech.RetrofitModelDataAnak.model.DataLokasi
import kotlinx.android.synthetic.main.activity_layout_list_anak.view.*
import kotlinx.android.synthetic.main.activity_lokasi_imunisasi.view.*

class DataLokasiListAdapter (var dataLokasis: ArrayList<DataLokasi>) :
    RecyclerView.Adapter<DataLokasiListAdapter.ViewHolder>() {
    fun updateDataLokasis(newPhotos: List<DataLokasi>){
        dataLokasis.clear()
        dataLokasis.addAll(newPhotos)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder (parent: ViewGroup, p1:Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.activity_lokasi_imunisasi, parent, false)
    )

    override fun getItemCount() = dataLokasis.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataLokasis[position])
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        fun bind(DataLokasis: DataLokasi){
//            val foto_dosen: ImageView = itemView.imageview
            val requestOp = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
            itemView.namaRumahSakit.text = DataLokasis.namaLokasi
            itemView.loc_JenisImunisasi.text = DataLokasis.jenisImunisasi
            itemView.loc_Hari.text = DataLokasis.hari
            itemView.loc_Waktu.text = DataLokasis.waktu
            itemView.loc_Alamat.text = DataLokasis.alamatImunisasi
            itemView.setOnClickListener{ view ->
                Toast.makeText(itemView.context, "Hello", Toast.LENGTH_LONG).show()
            }

            /*val alamaturl = DataAnaks.thumbnail
            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOp)
                .load("$alamaturl.png")
                .into(foto_dosen)*/
        }
    }
}