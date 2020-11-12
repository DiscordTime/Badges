package com.tab.mybadges.ui.badgeList

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tab.mybadges.databinding.BadgeListRvItemBinding
import com.tab.mybadges.entities.Badge

class BadgeListAdapter (
    private var badgeList: ArrayList<Badge>,
): RecyclerView.Adapter<BadgeListAdapter.ViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        return ViewHolder(BadgeListRvItemBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(badgeList.get(position))
    }

    override fun getItemCount(): Int {
        return badgeList.size
    }

    fun setBadgeList(list: List<Badge>) {
        badgeList.clear()
        badgeList.addAll(list)
        notifyDataSetChanged()
    }

    class ViewHolder(binding: BadgeListRvItemBinding): RecyclerView.ViewHolder(binding.root) {

        private var badgeImage: ImageView = binding.badgePhoto
        private var badgeName: TextView = binding.badgeName
        private var badgeRarity: TextView = binding.badgeRarity

        fun bind (badge: Badge) {
            badgeImage.setImageResource(badge.badgePhoto)
            badgeName.setText(badge.badgeName)
            badgeRarity.setText(badge.badgeRarity)
        }
    }
}