package com.umut.onka

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter (val ArticleList:ArrayList<DataClass>,val listener:MyClickListener):RecyclerView.Adapter<Adapter.MyViewHolder>(){

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView: ImageView=itemView.findViewById(R.id.imageView2)
        val textView:TextView=itemView.findViewById(R.id.title)

        init {
            itemView.setOnClickListener {
                val position =adapterPosition
                listener.onClick(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycle_view_row,parent,false))
    }

    override fun getItemCount(): Int {
        return ArticleList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val DataClass=ArticleList[position]
        holder.textView.text=ArticleList[position].dataTitle
        holder.imageView.setImageResource(ArticleList[position].dataImage)
    }
    interface MyClickListener{
        fun onClick(position: Int)
    }
}