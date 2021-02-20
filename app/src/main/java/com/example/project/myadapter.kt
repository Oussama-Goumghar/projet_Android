package com.example.project
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class myadapter(private val exampleList: List<items>):RecyclerView.Adapter<myadapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.itemlyout , parent , false)
       return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currn =  exampleList[position]
        holder.imageView.setImageResource(currn.images)
        holder.textv1.text = currn.text1 ;
        holder.textv2.text = currn.text2 ;    }

    override fun getItemCount() = exampleList.size ;



    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView : ImageView = itemView.findViewById(R.id.imageView)
        val textv1 : TextView = itemView.findViewById(R.id.textView1)
        val textv2 : TextView = itemView.findViewById(R.id.textView2)

    }
}