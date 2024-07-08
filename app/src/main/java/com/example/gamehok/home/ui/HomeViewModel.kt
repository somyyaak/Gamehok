package com.example.gamehok.home.ui

import androidx.lifecycle.ViewModel
import com.example.gamehok.data.Banner
import com.example.gamehok.data.Games
import com.example.gamehok.data.People
import com.example.gamehok.R
import com.example.gamehok.data.JoinMatch
import com.example.gamehok.data.LiveMatches
import com.example.gamehok.data.MoreTournament
import com.example.gamehok.data.OrganiserDetails
import com.example.gamehok.data.PubgUpcoming
import com.example.gamehok.data.RoundDetails
import com.example.gamehok.data.Round
import com.example.gamehok.data.Team
import com.example.gamehok.data.Tournament
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {

    fun getTournamentData(): ArrayList<Tournament> {
        val  tournamentList: ArrayList<Tournament> = arrayListOf()
        GlobalScope.launch {
            tournamentList.add(
                getTournamentDataItem()
            )
            tournamentList.add(
                getTournamentDataItem()
            )
            tournamentList.add(
                getTournamentDataItem()
            )
            tournamentList.add(
                getTournamentDataItem()
            )
            tournamentList.add(
                getTournamentDataItem()
            )
            tournamentList.add(
                getTournamentDataItem()
            )
            tournamentList.add(
                getTournamentDataItem()
            )

        }
        return tournamentList
    }

    private fun getTournamentDataItem(): Tournament {
        return Tournament(
            R.drawable.tournament1 , "PUBG tournament  By Red Bull",
            "25 Jun - 26 Jun","10",
            "670/800",
            "Registration Closes in 2d 15h 10m",
            "Solo",
            "Single Elimination",
            "Tue 24th Jan 2024, 01:00 PM",
            "10 mins before the match starts",
            2000,
            listOf(1000, 500, 200, 100, 100),
            RoundDetails(
                Round("Single", "Top 5 in group"),
                Round("Single", "Top 5 in group"),
                Round("Single", "Top 5 from all"),
                Round("Single", "Winner")
            ),
            listOf("Have your game open already and on the latest version", "Once the match is configured you will receive an invite in-game to join the lobby.", "Join the match.", "Wait for the game to start.", "When eliminated return to the match room page to be ready to join the next map in the round."),
            OrganiserDetails(
                R.drawable.organiser_image,
                "Gamehok Esports",
                "This is the in house organiser of this platform you can follow our page on this platform for regular updates",
                "9890987754",
                "support@gamehok.com",
                "9890987754",
            ),
            listOf(
                Tournament(
                    R.drawable.tournament1 , "PUBG tournament  By Red Bull",
                    "25 Jun - 26 Jun","10",
                    "670/800",
                    "Registration Closes in 2d 15h 10m",
                    "Solo",
                    "Single Elimination",
                    "Tue 24th Jan 2024, 01:00 PM",
                    "10 mins before the match starts",
                    2000,
                    listOf(1000, 500, 200, 100, 100),
                    RoundDetails(
                        Round("Single", "Top 5 in group"),
                        Round("Single", "Top 5 in group"),
                        Round("Single", "Top 5 from all"),
                        Round("Single", "Winner")
                    ),
                    listOf("Have your game open already and on the latest version", "Once the match is configured you will receive an invite in-game to join the lobby.", "Join the match.", "Wait for the game to start.", "When eliminated return to the match room page to be ready to join the next map in the round."),
                    OrganiserDetails(
                        R.drawable.organiser_image,
                        "Gamehok Esports",
                        "This is the in house organiser of this platform you can follow our page on this platform for regular updates",
                        "9890987754",
                        "support@gamehok.com",
                        "9890987754",
                    ),
                    listOf(
                        Tournament(
                            R.drawable.tournament1 , "PUBG tournament  By Red Bull",
                            "25 Jun - 26 Jun","10",
                            "670/800",
                            "Registration Closes in 2d 15h 10m",
                            "Solo",
                            "Single Elimination",
                            "Tue 24th Jan 2024, 01:00 PM",
                            "10 mins before the match starts",
                            2000,
                            listOf(1000, 500, 200, 100, 100),
                            RoundDetails(
                                Round("Single", "Top 5 in group"),
                                Round("Single", "Top 5 in group"),
                                Round("Single", "Top 5 from all"),
                                Round("Single", "Winner")
                            ),
                            listOf("Have your game open already and on the latest version", "Once the match is configured you will receive an invite in-game to join the lobby.", "Join the match.", "Wait for the game to start.", "When eliminated return to the match room page to be ready to join the next map in the round."),
                            OrganiserDetails(
                                R.drawable.organiser_image,
                                "Gamehok Esports",
                                "This is the in house organiser of this platform you can follow our page on this platform for regular updates",
                                "9890987754",
                                "support@gamehok.com",
                                "9890987754",
                            ),
                            listOf()
                        )
                    )
                ),
                Tournament(
                    R.drawable.tournament1 , "PUBG tournament  By Red Bull",
                    "25 Jun - 26 Jun","10",
                    "670/800",
                    "Registration Closes in 2d 15h 10m",
                    "Solo",
                    "Single Elimination",
                    "Tue 24th Jan 2024, 01:00 PM",
                    "10 mins before the match starts",
                    2000,
                    listOf(1000, 500, 200, 100, 100),
                    RoundDetails(
                        Round("Single", "Top 5 in group"),
                        Round("Single", "Top 5 in group"),
                        Round("Single", "Top 5 from all"),
                        Round("Single", "Winner")
                    ),
                    listOf("Have your game open already and on the latest version", "Once the match is configured you will receive an invite in-game to join the lobby.", "Join the match.", "Wait for the game to start.", "When eliminated return to the match room page to be ready to join the next map in the round."),
                    OrganiserDetails(
                        R.drawable.organiser_image,
                        "Gamehok Esports",
                        "This is the in house organiser of this platform you can follow our page on this platform for regular updates",
                        "9890987754",
                        "support@gamehok.com",
                        "9890987754",
                    ),
                    listOf(
                        Tournament(
                            R.drawable.tournament1 , "PUBG tournament  By Red Bull",
                            "25 Jun - 26 Jun","10",
                            "670/800",
                            "Registration Closes in 2d 15h 10m",
                            "Solo",
                            "Single Elimination",
                            "Tue 24th Jan 2024, 01:00 PM",
                            "10 mins before the match starts",
                            2000,
                            listOf(1000, 500, 200, 100, 100),
                            RoundDetails(
                                Round("Single", "Top 5 in group"),
                                Round("Single", "Top 5 in group"),
                                Round("Single", "Top 5 from all"),
                                Round("Single", "Winner")
                            ),
                            listOf("Have your game open already and on the latest version", "Once the match is configured you will receive an invite in-game to join the lobby.", "Join the match.", "Wait for the game to start.", "When eliminated return to the match room page to be ready to join the next map in the round."),
                            OrganiserDetails(
                                R.drawable.organiser_image,
                                "Gamehok Esports",
                                "This is the in house organiser of this platform you can follow our page on this platform for regular updates",
                                "9890987754",
                                "support@gamehok.com",
                                "9890987754",
                            ),
                            listOf()
                        )
                    )
                ),
                Tournament(
                    R.drawable.tournament1 , "PUBG tournament  By Red Bull",
                    "25 Jun - 26 Jun","10",
                    "670/800",
                    "Registration Closes in 2d 15h 10m",
                    "Solo",
                    "Single Elimination",
                    "Tue 24th Jan 2024, 01:00 PM",
                    "10 mins before the match starts",
                    2000,
                    listOf(1000, 500, 200, 100, 100),
                    RoundDetails(
                        Round("Single", "Top 5 in group"),
                        Round("Single", "Top 5 in group"),
                        Round("Single", "Top 5 from all"),
                        Round("Single", "Winner")
                    ),
                    listOf("Have your game open already and on the latest version", "Once the match is configured you will receive an invite in-game to join the lobby.", "Join the match.", "Wait for the game to start.", "When eliminated return to the match room page to be ready to join the next map in the round."),
                    OrganiserDetails(
                        R.drawable.organiser_image,
                        "Gamehok Esports",
                        "This is the in house organiser of this platform you can follow our page on this platform for regular updates",
                        "9890987754",
                        "support@gamehok.com",
                        "9890987754",
                    ),
                    listOf(
                        Tournament(
                            R.drawable.tournament1 , "PUBG tournament  By Red Bull",
                            "25 Jun - 26 Jun","10",
                            "670/800",
                            "Registration Closes in 2d 15h 10m",
                            "Solo",
                            "Single Elimination",
                            "Tue 24th Jan 2024, 01:00 PM",
                            "10 mins before the match starts",
                            2000,
                            listOf(1000, 500, 200, 100, 100),
                            RoundDetails(
                                Round("Single", "Top 5 in group"),
                                Round("Single", "Top 5 in group"),
                                Round("Single", "Top 5 from all"),
                                Round("Single", "Winner")
                            ),
                            listOf("Have your game open already and on the latest version", "Once the match is configured you will receive an invite in-game to join the lobby.", "Join the match.", "Wait for the game to start.", "When eliminated return to the match room page to be ready to join the next map in the round."),
                            OrganiserDetails(
                                R.drawable.organiser_image,
                                "Gamehok Esports",
                                "This is the in house organiser of this platform you can follow our page on this platform for regular updates",
                                "9890987754",
                                "support@gamehok.com",
                                "9890987754",
                            ),
                            listOf()
                        )
                    )
                ),
                Tournament(
                    R.drawable.tournament1 , "PUBG tournament  By Red Bull",
                    "25 Jun - 26 Jun","10",
                    "670/800",
                    "Registration Closes in 2d 15h 10m",
                    "Solo",
                    "Single Elimination",
                    "Tue 24th Jan 2024, 01:00 PM",
                    "10 mins before the match starts",
                    2000,
                    listOf(1000, 500, 200, 100, 100),
                    RoundDetails(
                        Round("Single", "Top 5 in group"),
                        Round("Single", "Top 5 in group"),
                        Round("Single", "Top 5 from all"),
                        Round("Single", "Winner")
                    ),
                    listOf("Have your game open already and on the latest version", "Once the match is configured you will receive an invite in-game to join the lobby.", "Join the match.", "Wait for the game to start.", "When eliminated return to the match room page to be ready to join the next map in the round."),
                    OrganiserDetails(
                        R.drawable.organiser_image,
                        "Gamehok Esports",
                        "This is the in house organiser of this platform you can follow our page on this platform for regular updates",
                        "9890987754",
                        "support@gamehok.com",
                        "9890987754",
                    ),
                    listOf(
                        Tournament(
                            R.drawable.tournament1 , "PUBG tournament  By Red Bull",
                            "25 Jun - 26 Jun","10",
                            "670/800",
                            "Registration Closes in 2d 15h 10m",
                            "Solo",
                            "Single Elimination",
                            "Tue 24th Jan 2024, 01:00 PM",
                            "10 mins before the match starts",
                            2000,
                            listOf(1000, 500, 200, 100, 100),
                            RoundDetails(
                                Round("Single", "Top 5 in group"),
                                Round("Single", "Top 5 in group"),
                                Round("Single", "Top 5 from all"),
                                Round("Single", "Winner")
                            ),
                            listOf("Have your game open already and on the latest version", "Once the match is configured you will receive an invite in-game to join the lobby.", "Join the match.", "Wait for the game to start.", "When eliminated return to the match room page to be ready to join the next map in the round."),
                            OrganiserDetails(
                                R.drawable.organiser_image,
                                "Gamehok Esports",
                                "This is the in house organiser of this platform you can follow our page on this platform for regular updates",
                                "9890987754",
                                "support@gamehok.com",
                                "9890987754",
                            ),
                            listOf()
                        )
                    )
                ),
                Tournament(
                    R.drawable.tournament1 , "PUBG tournament  By Red Bull",
                    "25 Jun - 26 Jun","10",
                    "670/800",
                    "Registration Closes in 2d 15h 10m",
                    "Solo",
                    "Single Elimination",
                    "Tue 24th Jan 2024, 01:00 PM",
                    "10 mins before the match starts",
                    2000,
                    listOf(1000, 500, 200, 100, 100),
                    RoundDetails(
                        Round("Single", "Top 5 in group"),
                        Round("Single", "Top 5 in group"),
                        Round("Single", "Top 5 from all"),
                        Round("Single", "Winner")
                    ),
                    listOf("Have your game open already and on the latest version", "Once the match is configured you will receive an invite in-game to join the lobby.", "Join the match.", "Wait for the game to start.", "When eliminated return to the match room page to be ready to join the next map in the round."),
                    OrganiserDetails(
                        R.drawable.organiser_image,
                        "Gamehok Esports",
                        "This is the in house organiser of this platform you can follow our page on this platform for regular updates",
                        "9890987754",
                        "support@gamehok.com",
                        "9890987754",
                    ),
                    listOf(
                        Tournament(
                            R.drawable.tournament1 , "PUBG tournament  By Red Bull",
                            "25 Jun - 26 Jun","10",
                            "670/800",
                            "Registration Closes in 2d 15h 10m",
                            "Solo",
                            "Single Elimination",
                            "Tue 24th Jan 2024, 01:00 PM",
                            "10 mins before the match starts",
                            2000,
                            listOf(1000, 500, 200, 100, 100),
                            RoundDetails(
                                Round("Single", "Top 5 in group"),
                                Round("Single", "Top 5 in group"),
                                Round("Single", "Top 5 from all"),
                                Round("Single", "Winner")
                            ),
                            listOf("Have your game open already and on the latest version", "Once the match is configured you will receive an invite in-game to join the lobby.", "Join the match.", "Wait for the game to start.", "When eliminated return to the match room page to be ready to join the next map in the round."),
                            OrganiserDetails(
                                R.drawable.organiser_image,
                                "Gamehok Esports",
                                "This is the in house organiser of this platform you can follow our page on this platform for regular updates",
                                "9890987754",
                                "support@gamehok.com",
                                "9890987754",
                            ),
                            listOf()
                        )
                    )
                )
            )
        )
    }

    fun getGamesData(): ArrayList<Games> {
        val  gamesList: ArrayList<Games> = arrayListOf()
        GlobalScope.launch {
            gamesList.add(Games(R.drawable.pubg, "PUBG"))
            gamesList.add(Games(R.drawable.valorant, "Valorant"))
            gamesList.add(Games(R.drawable.apex_legend, "Apex Legend"))
            gamesList.add(Games(R.drawable.call_of_duty, "Call Of Duty"))
            gamesList.add(Games(R.drawable.counter_strike, "Counter Strike"))
            gamesList.add(Games(R.drawable.pubg, "PUBG"))
        }
        return gamesList
    }

    fun getGamerData(): ArrayList<People> {
        val  gamerList: ArrayList<People> = arrayListOf()
        GlobalScope.launch {
            gamerList.add(People(R.drawable.gamer,"Legend Gamer"))
            gamerList.add(People(R.drawable.gamer2,"Legend Gamer"))
            gamerList.add(People(R.drawable.gamer3,"Legend Gamer"))
    }
        return gamerList
    }

    fun getBannerData(): ArrayList<Banner> {
        val  bannerList: ArrayList<Banner> = arrayListOf()
        GlobalScope.launch {
            bannerList.add(Banner(R.drawable.banner1))
            bannerList.add(Banner(R.drawable.banner1))
            bannerList.add(Banner(R.drawable.banner1))
        }
        return bannerList
    }
}