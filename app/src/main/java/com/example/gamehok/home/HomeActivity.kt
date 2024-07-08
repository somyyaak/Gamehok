package com.example.gamehok.home

import com.example.gamehok.home.view.CallFragment
import com.example.gamehok.home.view.HomeFragment
import com.example.gamehok.tournamentDetails.views.ParticipantsFragment
import android.content.Intent
import com.example.gamehok.home.view.WinnersFragment
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.gamehok.R
import com.example.gamehok.data.Games
import com.example.gamehok.tournamentDetails.TournamentDetailsActivity
import com.example.gamehok.data.Tournament
import com.example.gamehok.gameDetails.GameDetailsActivity
import com.example.gamehok.home.ui.HomeViewModel
import com.example.gamehok.home.ui.adapters.BannerAdapter
import com.example.gamehok.home.ui.adapters.GameItemClickListener
import com.example.gamehok.home.ui.adapters.GamesAdapter
import com.example.gamehok.home.ui.adapters.JoinMatchAdapter
import com.example.gamehok.home.ui.adapters.LiveMatchesAdapter
import com.example.gamehok.home.ui.adapters.MoreTournamentAdapter
import com.example.gamehok.home.ui.adapters.PeopleAdapter
import com.example.gamehok.home.ui.adapters.PubgUpcomingAdapter
import com.example.gamehok.home.ui.adapters.TeamAdapter
import com.example.gamehok.home.ui.adapters.TournamentAdapter
import com.example.gamehok.home.ui.adapters.TournamentItemClickListener
import com.example.gamehok.home.ui.adapters.ViewPagerHomeAdapter
import com.google.android.material.tabs.TabLayout


class HomeActivity : AppCompatActivity(), TournamentItemClickListener, GameItemClickListener {
    private lateinit var pager: ViewPager
    private lateinit var tab: TabLayout
    private lateinit var homeViewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        pager = findViewById(R.id.viewPager)
        tab = findViewById(R.id.tabsHome)
        homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]
        findViewById<TextView>(R.id.home_coin_count).text = "2467"
        showBottomNavigation()
        handleBannerList()
        handleTournamentList()
        handleGamesList()
        handleGamerList()
    }

    private fun showBottomNavigation() {
        val adapterHome = ViewPagerHomeAdapter(supportFragmentManager)
        adapterHome.addFragment(HomeFragment(), "")
        adapterHome.addFragment(WinnersFragment(), "")
        adapterHome.addFragment(ParticipantsFragment(), "")
        adapterHome.addFragment(CallFragment(), "")
        pager.adapter = adapterHome
        tab.setupWithViewPager(pager)
        tab.getTabAt(0)?.setIcon((R.drawable.home))
        tab.getTabAt(1)?.setIcon((R.drawable.trophy))
        tab.getTabAt(2)?.setIcon((R.drawable.user))
        tab.getTabAt(3)?.setIcon((R.drawable.video))
    }


    private fun handleTournamentList() {
        val tournamentRecyclerView: RecyclerView = findViewById(R.id.TournamentRecyclerView)
        tournamentRecyclerView.setHasFixedSize((true))
        tournamentRecyclerView.adapter = TournamentAdapter(homeViewModel.getTournamentData(), this)
        tournamentRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun handleGamesList() {
        val gameRecyclerView: RecyclerView = findViewById(R.id.GameRecyclerView)
        gameRecyclerView.setHasFixedSize((true))
        gameRecyclerView.adapter = GamesAdapter(homeViewModel.getGamesData(), this)
        gameRecyclerView.layoutManager = GridLayoutManager(this, 3)
    }

    private fun handleGamerList() {
        val gamerRecyclerView: RecyclerView = findViewById(R.id.GamerRecyclerView)
        gamerRecyclerView.setHasFixedSize((true))
        gamerRecyclerView.adapter = PeopleAdapter(homeViewModel.getGamerData())
        gamerRecyclerView.layoutManager = LinearLayoutManager(this)
    }


    private fun handleBannerList() {
        val bannerRecyclerView: RecyclerView = findViewById(R.id.BannerRecyclerView)
        bannerRecyclerView.setHasFixedSize((true))
        bannerRecyclerView.adapter = BannerAdapter(homeViewModel.getBannerData())
        bannerRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

    override fun onTournamentItemClick(tournament: Tournament) {
        val intent = Intent(this, TournamentDetailsActivity::class.java)
    intent.putExtra(TOURNAMENT_KEY, tournament)
        startActivity(intent)
    }

    companion object {
        const val TOURNAMENT_KEY = "tournament"
    }

    override fun onGameItemClick(game: Games) {
        val intent = Intent(this, GameDetailsActivity::class.java)
        startActivity(intent)
    }

}