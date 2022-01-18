package com.example.recyclerviewtutorial

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textview.MaterialTextView

open class RecyclerAdapter(val list:ArrayList<ListModel>):RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

     open inner class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val textView=view.findViewById<MaterialTextView>(R.id.list_item_name)

    }

    @SuppressLint("InflateParams")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, null, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text=list[position].listItem
    }

    override fun getItemCount(): Int {
        return list.size
    }
}