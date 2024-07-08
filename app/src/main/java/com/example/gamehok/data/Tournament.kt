package com.example.gamehok.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Tournament(
    val tournamentImage: Int,
    val tournamentName: String,
    val tournamentDate: String,
    val entryAmount: String,
    val registeredUser: String,
    val registrationRemainingDuration: String,
    val teamSize: String,
    val eliminationFormat: String,
    val tournamentStartDetails: String,
    val tournamentCheckIn: String,
    val totalPrize: Int,
    val tournamentPrizes: List<Int>,
    val roundDetails: RoundDetails,
    val joinMatchInstructions: List<String>,
    val organiserDetails: OrganiserDetails,
    val similarTournaments: List<Tournament>,
): Parcelable
