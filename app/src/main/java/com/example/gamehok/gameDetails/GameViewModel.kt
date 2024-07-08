package com.example.gamehok.gameDetails

import androidx.lifecycle.ViewModel
import com.example.gamehok.R
import com.example.gamehok.data.LiveMatches
import com.example.gamehok.data.PubgUpcoming
import com.example.gamehok.data.Team
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class GameViewModel : ViewModel() {

    fun getLiveData(): ArrayList<LiveMatches> {
        val liveList: ArrayList<LiveMatches> = arrayListOf()
        GlobalScope.launch {
            liveList.add(
                LiveMatches(
                    R.drawable.tournament1,
                    "PUBG match presented by RED Bull",
                    "645/700"
                )
            )
            liveList.add(
                LiveMatches(
                    R.drawable.tournament1,
                    "PUBG match presented by RED Bull",
                    "645/700"
                )
            )
            liveList.add(
                LiveMatches(
                    R.drawable.tournament1,
                    "PUBG match presented by RED Bull",
                    "645/700"
                )
            )
        }
        return liveList
    }

    fun getUpcomingData(): ArrayList<PubgUpcoming> {
        val upcomingList: ArrayList<PubgUpcoming> = arrayListOf()
        GlobalScope.launch {
            upcomingList.add(
                PubgUpcoming(
                    R.drawable.tournament1,
                    "PUBG match presented by RED Bull",
                    "25 Jun - 26 Jun",
                    "10",
                    "645/700"
                )
            )
            upcomingList.add(
                PubgUpcoming(
                    R.drawable.tournament1,
                    "PUBG match presented by RED Bull",
                    "25 Jun - 26 Jun",
                    "10",
                    "645/700"
                )
            )
            upcomingList.add(
                PubgUpcoming(
                    R.drawable.tournament1,
                    "PUBG match presented by RED Bull",
                    "25 Jun - 26 Jun",
                    "!0",
                    "645/700"
                )
            )
        }
        return upcomingList
    }

    fun getTeamData(): ArrayList<Team> {
        val teamList: ArrayList<Team> = arrayListOf()
        GlobalScope.launch {
            teamList.add(Team(R.drawable.team, "Gamer1"))
            teamList.add(Team(R.drawable.pubg3, "Gamer2"))
            teamList.add(Team(R.drawable.pubg2, "Gamer3"))
            teamList.add(Team(R.drawable.team, "Gamer4"))
            teamList.add(Team(R.drawable.pubg3, "Gamer5"))
        }
        return teamList
    }
}