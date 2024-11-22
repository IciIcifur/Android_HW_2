package com.example.hw_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StickerAdapter(private val stickersList: ArrayList<StickerModel>) :
    RecyclerView.Adapter<StickerAdapter.ViewHolderClass>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_row, parent, false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return stickersList.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = stickersList[position]
        holder.rvImage.setImageResource(currentItem.stickerImage)
        holder.rvTitle.text = currentItem.stickerTitle
    }

    class ViewHolderClass(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val rvImage: ImageView = itemView.findViewById(R.id.imageView)
        val rvTitle: TextView = itemView.findViewById(R.id.title)
    }
}