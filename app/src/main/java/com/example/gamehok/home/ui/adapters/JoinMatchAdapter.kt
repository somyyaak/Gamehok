package com.example.gamehok.home.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gamehok.R
import com.example.gamehok.data.JoinMatch
import com.example.gamehok.data.People

class JoinMatchAdapter (private val stepsList : List<String>) : RecyclerView.Adapter<JoinMatchAdapter.JoinMatchViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JoinMatchViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.join_match_item,parent,false)
        return JoinMatchViewHolder(view)
    }



    override fun onBindViewHolder(holder: JoinMatchViewHolder, position: Int) {
        val currentItem = stepsList[position]
        holder.steps.text = currentItem
    }
    override fun getItemCount(): Int {
        return stepsList.size
    }
    class JoinMatchViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var steps: TextView = itemView.findViewById(R.id.join_instructions)
    }

}