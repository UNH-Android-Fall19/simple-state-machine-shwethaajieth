package com.example.sandwichstatemachine

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SandwichListAdapter(val sandwichList: ArrayList<Sandwich>): RecyclerView.Adapter<SandwichListAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder?.sandwichName?.setText(sandwichList[position].sandwichName)
        holder?.sandwichImage?.setImageResource(sandwichList[position].sandwichImage!!)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.sandwich_list, parent, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return sandwichList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val sandwichName = itemView.findViewById<TextView>(R.id.sandwich_name)
        val sandwichImage = itemView.findViewById<ImageView>(R.id.sandwich_image)

    }

}