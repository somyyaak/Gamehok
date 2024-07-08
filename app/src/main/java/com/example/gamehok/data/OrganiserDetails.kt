package com.example.gamehok.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class OrganiserDetails(
    val organiserImage: Int,
    val organiserName: String,
    val organiserDescription: String,
    val phoneNumber: String,
    val email: String,
    val whatsAppNumber: String,
): Parcelable