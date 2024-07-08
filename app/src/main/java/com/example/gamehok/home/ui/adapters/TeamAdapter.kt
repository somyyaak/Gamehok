package com.example.gamehok.home.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gamehok.R
import com.example.gamehok.data.People
import com.example.gamehok.data.Team

class TeamAdapter(private val teamList : ArrayList<Team>) : RecyclerView.Adapter<TeamAdapter.TeamViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.pubg_team,parent,false)
        return TeamViewHolder(view)
    }



    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        val currentItem = teamList[position]
        holder.playerImage.setImageResource((currentItem.player))
        holder.playerName.text = currentItem.playerName
    }
    override fun getItemCount(): Int {
        return teamList.size
    }
    class TeamViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var playerImage = itemView.findViewById<ImageView>(R.id.team)
        var playerName = itemView.findViewById<TextView>(R.id.user_name)
    }

}