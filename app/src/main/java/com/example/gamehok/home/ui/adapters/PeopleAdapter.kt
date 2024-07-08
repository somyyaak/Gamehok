package com.example.gamehok.home.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gamehok.R
import com.example.gamehok.data.People

class PeopleAdapter(private val peopleList : ArrayList<People>) :RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.home_people_item,parent,false)
        return PeopleViewHolder(view)
    }



    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        val currentItem = peopleList[position]
        holder.gamerImage.setImageResource((currentItem.gamer))
        holder.gamerName.text = currentItem.gamerName
    }
    override fun getItemCount(): Int {
        return peopleList.size
    }
    class PeopleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var gamerImage = itemView.findViewById<ImageView>(R.id.gamer)
        var gamerName = itemView.findViewById<TextView>(R.id.gamerName)
    }

}
