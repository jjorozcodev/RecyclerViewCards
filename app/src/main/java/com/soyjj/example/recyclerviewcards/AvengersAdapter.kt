package com.soyjj.example.recyclerviewcards

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide

class AvengersAdapter(var list:ArrayList<Avengers>) : RecyclerView.Adapter<AvengersAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.content_item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: AvengersAdapter.ViewHolder, posicion: Int) {
        holder.bindItems(list[posicion])
    }

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        fun bindItems(data:Avengers){
            var personaje:TextView=itemView.findViewById(R.id.tvPersonaje)
            var heroe:TextView=itemView.findViewById(R.id.tvAvenger)
            var thumbnailImg:ImageView=itemView.findViewById(R.id.thumbnail)

            personaje.text = data.nombre
            heroe.text = data.heroe

            Glide.with(itemView.context).load(data.thumbnail).into(thumbnailImg)

            itemView.setOnClickListener{
                Toast.makeText(itemView.context, "El vengador es: ${data.heroe}", Toast.LENGTH_LONG).show()

            }
        }
    }
}