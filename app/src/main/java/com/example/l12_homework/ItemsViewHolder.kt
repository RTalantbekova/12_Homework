package com.example.l12_homework

import android.view.View
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*

class ItemsViewHolder(view : View) : RecyclerView.ViewHolder(view) {
    fun bind(item : ItemData){
        itemView.txtName.text = item.name
        itemView.txtTitle.text = item.title
    }
}