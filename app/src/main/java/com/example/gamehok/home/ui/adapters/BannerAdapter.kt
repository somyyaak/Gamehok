package com.example.gamehok.home.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.gamehok.R
import com.example.gamehok.data.Banner

class BannerAdapter (private val bannerList : ArrayList<Banner>) :RecyclerView.Adapter<BannerAdapter.BannerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.home_banner1_item,parent,false)
        return BannerViewHolder(view)
    }



    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
        val currentItem = bannerList[position]
        holder.bannerImage.setImageResource((currentItem.bannerImage))
    }
    override fun getItemCount(): Int {
        return bannerList.size
    }
    class BannerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var bannerImage = itemView.findViewById<ImageView>(R.id.banner)
    }

}