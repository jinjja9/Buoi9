package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemCycleBinding

class CycleAdapter(private val items: List<Pair<String, List<Int>>>) : RecyclerView.Adapter<CycleAdapter.CycleViewHolder>() {

    class CycleViewHolder(val binding: ItemCycleBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CycleViewHolder {
        val binding = ItemCycleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CycleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CycleViewHolder, position: Int) {
        val (title, imageList) = items[position]
        holder.binding.title.text = title

        val imageAdapter = PersonAdapter(imageList)
        holder.binding.recyclerView.layoutManager = LinearLayoutManager(holder.binding.recyclerView.context, LinearLayoutManager.HORIZONTAL, false)
        holder.binding.recyclerView.adapter = imageAdapter
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
