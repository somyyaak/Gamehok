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
import com.example.gamehok.data.PubgUpcoming

class PubgUpcomingAdapter(private val upcomingMatchesList : ArrayList<PubgUpcoming>) :RecyclerView.Adapter<PubgUpcomingAdapter.UpcomingMatchViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpcomingMatchViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.pubg_tournament,parent,false)
        return UpcomingMatchViewHolder(view)
    }



    override fun onBindViewHolder(holder: UpcomingMatchViewHolder, position: Int) {
        val currentItem = upcomingMatchesList[position]
        holder.upcomingTournamentImage.setImageResource((currentItem.upcomingTournamentImage))
        holder.upcomingTournamentName.text = currentItem.upcomingTournamentName
        holder.upcomingTournamentDate.text = currentItem.upcomingTournamentDate
        holder.upcomingEntryAmount.text = currentItem.upcomingEntryAmount
        holder.upcomingRegisteredUser.text = currentItem.upcomingRegisteredUser
    }
    override fun getItemCount(): Int {
        return upcomingMatchesList.size
    }
    class UpcomingMatchViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var upcomingTournamentImage: ImageView = itemView.findViewById<ImageView>(R.id.upcoming_tournament_img)
        var upcomingTournamentName = itemView.findViewById<TextView>(R.id.upcoming_tournament_name_pubg)
        var upcomingTournamentDate = itemView.findViewById<TextView>(R.id.upcoming_tournament_date_pubg)
        var upcomingEntryAmount = itemView.findViewById<TextView>(R.id.upcoming_entry_amount_pubg)
        var upcomingRegisteredUser = itemView.findViewById<TextView>(R.id.upcoming_registered_users_pubg)

    }

}