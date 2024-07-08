package com.example.gamehok.tournamentDetails

import com.example.gamehok.tournamentDetails.views.OverviewFragment
import com.example.gamehok.tournamentDetails.views.RulesFragment
import com.example.gamehok.tournamentDetails.views.StandingFragment
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.gamehok.R
import com.example.gamehok.tournamentDetails.ui.adapters.ViewPagerAdapter
import com.example.gamehok.data.Tournament
import com.example.gamehok.home.view.PlayersFragment
import com.google.android.material.tabs.TabLayout

class TournamentDetailsActivity : AppCompatActivity() {
    var tournament: Tournament? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tournament_details)
        tournament = intent.getParcelableExtra(TOURNAMENT_KEY)
        handleTabNavigation()
        findViewById<TextView>(R.id.tournament_title).text = tournament?.tournamentName
        findViewById<TextView>(R.id.registration_text).text = tournament?.registrationRemainingDuration
        findViewById<TextView>(R.id.entry_amount).text = tournament?.entryAmount
        findViewById<TextView>(R.id.players).text = tournament?.registeredUser
        findViewById<ImageView>(R.id.tournament_image).setImageResource(tournament?.tournamentImage?:0)
    }

    private fun handleTabNavigation() {
        val bundle = Bundle()
        bundle.putParcelable(TOURNAMENT_KEY, tournament)
        val overviewFragment = OverviewFragment()
        overviewFragment.setArguments(bundle)
        val tab: TabLayout = findViewById(R.id.tabs)
        val pager: ViewPager = findViewById(R.id.viewPager)
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(overviewFragment, "Overview")
        adapter.addFragment(PlayersFragment(), "Players")
        adapter.addFragment(RulesFragment(), "Rules")
        adapter.addFragment(StandingFragment(), "Standing")
        pager.adapter = adapter
        tab.setupWithViewPager(pager)
    }

    companion object {
        const val TOURNAMENT_KEY = "tournament"
    }
}