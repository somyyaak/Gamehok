package com.example.gamehok.gameDetails

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gamehok.R
import com.example.gamehok.home.ui.adapters.LiveMatchesAdapter
import com.example.gamehok.home.ui.adapters.PubgUpcomingAdapter
import com.example.gamehok.home.ui.adapters.TeamAdapter

class GameDetailsActivity: AppCompatActivity() {
    private lateinit var gameViewModel: GameViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_details)
        gameViewModel = ViewModelProvider(this)[GameViewModel::class.java]
        handleTeam()
        handleLiveList()
        handleUpcomingTournament()
    }

    private fun handleUpcomingTournament() {
        val upcomingTournament: RecyclerView = findViewById(R.id.pubgRecyclerView)
        upcomingTournament.setHasFixedSize((true))
        upcomingTournament.adapter = PubgUpcomingAdapter(gameViewModel.getUpcomingData())
        upcomingTournament.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun handleTeam() {
        val team: RecyclerView = findViewById(R.id.teamRecyclerView)
        team.setHasFixedSize((true))
        team.adapter = TeamAdapter(gameViewModel.getTeamData())
        team.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun handleLiveList() {
        val liveRecyclerView: RecyclerView = findViewById(R.id.LiveRecyclerView)
        liveRecyclerView.setHasFixedSize((true))
        liveRecyclerView.adapter = LiveMatchesAdapter(gameViewModel.getLiveData())
        liveRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

}