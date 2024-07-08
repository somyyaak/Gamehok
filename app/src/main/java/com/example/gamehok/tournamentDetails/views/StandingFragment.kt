package com.example.gamehok.tournamentDetails.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.gamehok.R

class StandingFragment : Fragment() {
    // inflate the layout
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) =
        inflater.inflate(R.layout.fragment_standing, container, false)!!
}
