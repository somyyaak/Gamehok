package com.example.gamehok.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class RoundDetails(
    val qualifierRound: Round,
    val quarterFinalRound: Round,
    val semiFinalRound: Round,
    val finalRound: Round,
): Parcelable