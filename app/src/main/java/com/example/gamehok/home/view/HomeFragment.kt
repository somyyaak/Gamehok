package com.example.gamehok.home.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.gamehok.R

class HomeFragment : Fragment() {
    // inflate the layout
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) =
        inflater.inflate(R.layout.fragment_home, container, false)!!
}
