package com.example.krecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KeysListAdapter(private val item: ArrayList<String>): RecyclerView.Adapter<KeyViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KeyViewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_keys, parent, false)
        return KeyViewholder(view)
    }

    override fun onBindViewHolder(holder: KeyViewholder, position: Int) {
        val currentItem = item[position]
        holder.titleView.text = currentItem
    }

    override fun getItemCount(): Int {
      return item.size
    }
}

class KeyViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titleView: TextView = itemView.findViewById(R.id.title)
}