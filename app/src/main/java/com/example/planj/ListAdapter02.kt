package com.example.planj

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.planj.databinding.ItemList02Binding

class ListAdapter02(private val value1: List<String>, private val value2: List<String>, private val parentPos: Int): RecyclerView.Adapter<ListAdapter02.MyView02>() {
    //val images = listOf(R.drawable.bread, R.drawable.cat, R.drawable.cookie, R.drawable.dog)

    inner class MyView02(private val binding: ItemList02Binding): RecyclerView.ViewHolder(binding.root) {
        fun bind(pos: Int) {
            //binding.imageView01.setImageResource(images[parentPos])
            //binding.textView02.text = data[pos]
            binding.textView02.text = value1[pos]
            binding.textView03.text = value2[pos]
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView02 {
        val view = ItemList02Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyView02(view)
    }

    override fun onBindViewHolder(holder: MyView02, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return value1.size
    }
}