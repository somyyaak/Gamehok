package com.example.gamehok.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Round(
    val roundType: String,
    val promotion: String,
): Parcelable