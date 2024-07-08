package com.example.gamehok.home.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gamehok.R
import com.example.gamehok.data.MoreTournament
import com.example.gamehok.data.PubgUpcoming

class MoreTournamentAdapter(private val moreTournamentList : ArrayList<MoreTournament>) :
    RecyclerView.Adapter<MoreTournamentAdapter.MoreTournamentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoreTournamentViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.more_tournament,parent,false)
        return MoreTournamentViewHolder(view)
    }



    override fun onBindViewHolder(holder: MoreTournamentViewHolder, position: Int) {
        val currentItem = moreTournamentList[position]
        holder.moreTournamentImage.setImageResource((currentItem.moreTournamentImage))
        holder.moreTournamentName.text = currentItem.moreTournamentName
        holder.moreTournamentDate.text = currentItem.moreTournamentDate
        holder.moreEntryAmount.text = currentItem.moreEntryAmount
        holder.moreRegisteredUser.text = currentItem.moreRegisteredUser
    }
    override fun getItemCount(): Int {
        return moreTournamentList.size
    }
    class MoreTournamentViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var moreTournamentImage: ImageView = itemView.findViewById<ImageView>(R.id.more_tournament_img)
        var moreTournamentName = itemView.findViewById<TextView>(R.id.more_tournament_name_pubg)
        var moreTournamentDate = itemView.findViewById<TextView>(R.id.more_tournament_date_pubg)
        var moreEntryAmount = itemView.findViewById<TextView>(R.id.more_entry_amount_pubg)
        var moreRegisteredUser = itemView.findViewById<TextView>(R.id.more_registered_users_pubg)

    }

}