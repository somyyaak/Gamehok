package com.example.gamehok.home.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gamehok.R
import com.example.gamehok.data.Games
import com.example.gamehok.data.Tournament

class GamesAdapter(private val gamesList : ArrayList<Games>, private val gameItemClickListener: GameItemClickListener) :RecyclerView.Adapter<GamesAdapter.GameViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.homes_games_item,parent,false)
        return GameViewHolder(view)
    }



     override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val currentItem = gamesList[position]
        holder.gameImage.setImageResource((currentItem.gamesImage))
        holder.gameName.text = currentItem.gamesName
        holder.itemView.setOnClickListener {
            gameItemClickListener.onGameItemClick(currentItem)
        }
    }
    override fun getItemCount(): Int {
        return gamesList.size
    }
    class GameViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var gameImage = itemView.findViewById<ImageView>(R.id.game_img)
        var gameName = itemView.findViewById<TextView>(R.id.game_name)
    }

}

interface GameItemClickListener {
    fun onGameItemClick(game: Games)
}







