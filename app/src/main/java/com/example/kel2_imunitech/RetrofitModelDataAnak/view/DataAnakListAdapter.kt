package com.example.kel2_imunitech.RetrofitModelDataAnak.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions
import com.example.kel2_imunitech.R
import com.example.kel2_imunitech.RetrofitModelDataAnak.model.DataAnak
import kotlinx.android.synthetic.main.activity_layout_list_anak.view.*

class DataAnakListAdapter (var dataAnaks: ArrayList<DataAnak>) :
        RecyclerView.Adapter<DataAnakListAdapter.ViewHolder>() {
        fun updateDataAnaks(newPhotos: List<DataAnak>){
            dataAnaks.clear()
            dataAnaks.addAll(newPhotos)
            notifyDataSetChanged()
        }
        override fun onCreateViewHolder (parent: ViewGroup, p1:Int) = ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.activity_layout_list_anak, parent, false)
        )

        override fun getItemCount() = dataAnaks.size

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(dataAnaks[position])
        }

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
            fun bind(DataAnaks: DataAnak){
//            val foto_dosen: ImageView = itemView.imageview
                val requestOp = RequestOptions()
                    .placeholder(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_launcher_background)
                itemView.nilai_nama_anak.text = DataAnaks.namaAnak
                itemView.nilai_tgl_anak.text = DataAnaks.tanggalLahir
                itemView.nilai_jeniskelamin_anak.text = DataAnaks.jenisKelamin
                itemView.nilai_alamat_anak.text = DataAnaks.alamatAnak
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