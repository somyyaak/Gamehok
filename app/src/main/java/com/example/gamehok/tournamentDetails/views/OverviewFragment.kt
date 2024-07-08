package com.example.gamehok.tournamentDetails.views

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gamehok.R
import com.example.gamehok.data.Tournament
import com.example.gamehok.home.HomeActivity
import com.example.gamehok.home.HomeActivity.Companion
import com.example.gamehok.home.ui.adapters.JoinMatchAdapter
import com.example.gamehok.home.ui.adapters.TournamentAdapter
import com.example.gamehok.home.ui.adapters.TournamentItemClickListener
import com.example.gamehok.tournamentDetails.TournamentDetailsActivity

class OverviewFragment : Fragment(), TournamentItemClickListener {
    var tournament: Tournament? = null
    // inflate the layout
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        tournament = arguments?.getParcelable(TOURNAMENT_KEY)
        return inflater.inflate(R.layout.overview_section, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.team_size_title).text = tournament?.teamSize
        view.findViewById<TextView>(R.id.format_size_title).text = tournament?.eliminationFormat
        view.findViewById<TextView>(R.id.status_size_title).text = tournament?.tournamentStartDetails
        view.findViewById<TextView>(R.id.check_in_size_title).text = tournament?.tournamentCheckIn
        view.findViewById<TextView>(R.id.total_prize_amount).text = tournament?.totalPrize.toString()
        handlePrizeData(view)
        handleRoundData(view)
        val joinInstructionsRecyclerView = view.findViewById<RecyclerView>(R.id.join_match_instructions)
        joinInstructionsRecyclerView.adapter = JoinMatchAdapter( tournament?.joinMatchInstructions?: listOf())
        joinInstructionsRecyclerView.layoutManager = LinearLayoutManager(context)
        val moreTournamentsRecyclerView = view.findViewById<RecyclerView>(R.id.more_tournaments_section)
        moreTournamentsRecyclerView.adapter = TournamentAdapter( tournament?.similarTournaments?: listOf(), this)
        moreTournamentsRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        handleOrganiserData(view)
    }

    private fun handleOrganiserData(view: View) {
        view.findViewById<TextView>(R.id.organiser_details_name).text = tournament?.organiserDetails?.organiserName
        view.findViewById<TextView>(R.id.email_value).text = tournament?.organiserDetails?.email
        view.findViewById<TextView>(R.id.phone_number).text = tournament?.organiserDetails?.phoneNumber
        view.findViewById<TextView>(R.id.whatsapp_number).text = tournament?.organiserDetails?.whatsAppNumber
        view.findViewById<TextView>(R.id.organiser_details_description).text = tournament?.organiserDetails?.organiserDescription
        view.findViewById<ImageView>(R.id.details_icon).setImageResource(tournament?.organiserDetails?.organiserImage?:0)
    }

    private fun handleRoundData(view: View) {
        val roundDetailsQualifiers = view.findViewById<LinearLayout>(R.id.round_details_qualifiers)
        roundDetailsQualifiers.findViewById<TextView>(R.id.rounds_title).text = "Qualifiers"
        roundDetailsQualifiers.findViewById<TextView>(R.id.rounds_type_title).text = tournament?.roundDetails?.qualifierRound?.roundType
        roundDetailsQualifiers.findViewById<TextView>(R.id.rounds_promotions).text = tournament?.roundDetails?.qualifierRound?.promotion
        val roundDetailsQuarterFinals = view.findViewById<LinearLayout>(R.id.round_details_quarter_finals)
        roundDetailsQuarterFinals.findViewById<TextView>(R.id.rounds_title).text = "Quarter Finals"
        roundDetailsQuarterFinals.findViewById<TextView>(R.id.rounds_type_title).text = tournament?.roundDetails?.quarterFinalRound?.roundType
        roundDetailsQuarterFinals.findViewById<TextView>(R.id.rounds_promotions).text = tournament?.roundDetails?.quarterFinalRound?.promotion
        val roundDetailsSemiFinals = view.findViewById<LinearLayout>(R.id.round_details_semi_final)
        roundDetailsSemiFinals.findViewById<TextView>(R.id.rounds_title).text = "Semi Finals"
        roundDetailsSemiFinals.findViewById<TextView>(R.id.rounds_type_title).text = tournament?.roundDetails?.semiFinalRound?.roundType
        roundDetailsSemiFinals.findViewById<TextView>(R.id.rounds_promotions).text = tournament?.roundDetails?.semiFinalRound?.promotion
        val roundDetailsFinals = view.findViewById<LinearLayout>(R.id.round_details_final)
        roundDetailsFinals.findViewById<TextView>(R.id.rounds_title).text = "Finals"
        roundDetailsFinals.findViewById<TextView>(R.id.rounds_type_title).text = tournament?.roundDetails?.finalRound?.roundType
        roundDetailsFinals.findViewById<TextView>(R.id.rounds_promotions).text = tournament?.roundDetails?.finalRound?.promotion

    }

    private fun handlePrizeData(view: View) {
        val firstPrizeItem =  view.findViewById<ConstraintLayout>(R.id.first_prize_item)
        firstPrizeItem.findViewById<TextView>(R.id.prize_amount).text = tournament?.tournamentPrizes?.get(0)
            ?.toString()
        firstPrizeItem.findViewById<TextView>(R.id.prize_title).text = "1st Prize"
        val secondPrizeItem =  view.findViewById<ConstraintLayout>(R.id.second_prize_item)
        secondPrizeItem.findViewById<TextView>(R.id.prize_amount).text = tournament?.tournamentPrizes?.get(1)
            ?.toString()
        secondPrizeItem.findViewById<TextView>(R.id.prize_title).text = "2nd Prize"
        val thirdPrizeItem =  view.findViewById<ConstraintLayout>(R.id.third_prize_item)
        thirdPrizeItem.findViewById<TextView>(R.id.prize_amount).text = tournament?.tournamentPrizes?.get(2)
            ?.toString()
        thirdPrizeItem.findViewById<TextView>(R.id.prize_title).text = "3rd Prize"
        val fourthPrizeItem =  view.findViewById<ConstraintLayout>(R.id.fourth_prize_item)
        fourthPrizeItem.findViewById<TextView>(R.id.prize_amount).text = tournament?.tournamentPrizes?.get(3)
            ?.toString()
        fourthPrizeItem.findViewById<TextView>(R.id.prize_title).text = "4th Prize"
        val fifthPrizeItem =  view.findViewById<ConstraintLayout>(R.id.fifth_prize_item)
        fifthPrizeItem.findViewById<TextView>(R.id.prize_amount).text = tournament?.tournamentPrizes?.get(4)
            ?.toString()
        fifthPrizeItem.findViewById<TextView>(R.id.prize_title).text = "5th Prize"
    }

    companion object {
        const val TOURNAMENT_KEY = "tournament"
    }

    override fun onTournamentItemClick(tournament: Tournament) {
        val intent = Intent(requireActivity(), TournamentDetailsActivity::class.java)
        intent.putExtra(HomeActivity.TOURNAMENT_KEY, tournament)
        startActivity(intent)
    }
}
