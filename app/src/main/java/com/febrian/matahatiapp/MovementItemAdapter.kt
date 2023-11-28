package com.febrian.matahatiapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.febrian.matahatiapp.databinding.ItemMovementBinding

class MovementItemAdapter(
    private val listItem: ArrayList<ItemMovement>,
    private val callback: DetailCallback
) : RecyclerView.Adapter<MovementItemAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemMovementBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(itemMovement: ItemMovement) {

        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovementItemAdapter.ViewHolder {
        val view =
            ItemMovementBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovementItemAdapter.ViewHolder, position: Int) {
        holder.bind(listItem[position])
    }

    override fun getItemCount(): Int {
        return listItem.size
    }
}