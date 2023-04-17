package com.example.curriculumbuilder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.curriculumbuilder.databinding.EducationItemBinding

class EducationAdapter(
    private val items: MutableList<ItemData>,
    private val onItemClick: (ItemData) -> Unit
) : RecyclerView.Adapter<EducationAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            EducationItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding).apply {
            this.itemView.setOnClickListener {
                item?.let(onItemClick::invoke)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.item = item
        with(holder.binding) {
            name.text = item.name
            description.text = item.detail
            image.setImageResource(item.image)
        }
    }

    class ViewHolder(val binding: EducationItemBinding) : RecyclerView.ViewHolder(binding.root) {
        var item: ItemData? = null
    }

    fun remove(item: ItemData) {
        items.remove(item)
        notifyDataSetChanged()
    }

    fun add(item: ItemData) {
        items.add(item)
        notifyDataSetChanged()
    }
}
