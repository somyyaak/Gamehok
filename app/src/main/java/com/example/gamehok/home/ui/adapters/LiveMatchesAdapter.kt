package com.example.gamehok.home.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gamehok.R
import com.example.gamehok.data.Games
import com.example.gamehok.data.LiveMatches

class LiveMatchesAdapter(private val liveMatchesList : ArrayList<LiveMatches>) :RecyclerView.Adapter<LiveMatchesAdapter.LiveMatchViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LiveMatchViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.live_matches_item,parent,false)
        return LiveMatchViewHolder(view)
    }



    override fun onBindViewHolder(holder: LiveMatchViewHolder, position: Int) {
        val currentItem = liveMatchesList[position]
        holder.tournamentImage.setImageResource((currentItem.tournamentImage))
        holder.tournamentName.text = currentItem.tournamentName
        holder.registeredUser.text = currentItem.registeredUser
    }
    override fun getItemCount(): Int {
        return liveMatchesList.size
    }
    class LiveMatchViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tournamentImage: ImageView = itemView.findViewById<ImageView>(R.id.live_tournament_img)
        var tournamentName = itemView.findViewById<TextView>(R.id.live_tournament_name)
        var registeredUser = itemView.findViewById<TextView>(R.id.enrolled_users)

    }

}