package com.example.gamehok.home.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gamehok.R
import com.example.gamehok.data.Tournament

class TournamentAdapter(private val tournamentList : List<Tournament>, private val tournamentItemClickLiner: TournamentItemClickListener) :RecyclerView.Adapter<TournamentAdapter.TournamentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TournamentViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.home_tournament_item, parent, false)
        return TournamentViewHolder(view)
    }




    override fun onBindViewHolder(holder: TournamentViewHolder, position: Int) {
        val currentItem = tournamentList[position]
        holder.tournamentImage.setImageResource((currentItem.tournamentImage))
        holder.tournamentName.text = currentItem.tournamentName
        holder.tournamentDate.text = currentItem.tournamentDate
        holder.entryAmount.text = currentItem.entryAmount
        holder.registeredUser.text = currentItem.registeredUser
        holder.itemView.setOnClickListener {
            tournamentItemClickLiner.onTournamentItemClick(currentItem)
        }
    }

    override fun getItemCount(): Int {
        return tournamentList.size
    }

    class TournamentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tournamentImage = itemView.findViewById<ImageView>(R.id.tournament_img)
        var tournamentName = itemView.findViewById<TextView>(R.id.tournament_name)
        var calImage = itemView.findViewById<ImageView>(R.id.calender_img)
        var coinImage = itemView.findViewById<ImageView>(R.id.coin)
        var userImage = itemView.findViewById<ImageView>(R.id.user)
        var arrowImage = itemView.findViewById<ImageView>(R.id.arrow)
        var tournamentDate = itemView.findViewById<TextView>(R.id.tournament_date)
        var entry = itemView.findViewById<TextView>(R.id.entry)
        var entryAmount = itemView.findViewById<TextView>(R.id.entry_amount)
        var registeredUser = itemView.findViewById<TextView>(R.id.registered_users)
        var tournamentDetails = itemView.findViewById<TextView>(R.id.tournament_details)

    }
}

interface TournamentItemClickListener {
    fun onTournamentItemClick(tournament: Tournament)
}
