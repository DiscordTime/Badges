package com.tab.mybadges.ui.badgeList

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tab.mybadges.R
import com.tab.mybadges.entities.Badge

class BadgeListAdapter (
    private var badgeList: ArrayList<Badge>,
    private val layout: Int
): RecyclerView.Adapter<BadgeListAdapter.ViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(layout, parent, false)
        context = parent.context
        return ViewHolder(view)
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

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        private var badgeImage: ImageView = itemView.findViewById(R.id.badge_photo)
        private var badgeName: TextView = itemView.findViewById(R.id.badge_name)
        private var badgeRarity: TextView = itemView.findViewById(R.id.badge_rarity)

        fun bind (badge: Badge) {
            badgeImage.setImageResource(badge.badgePhoto)
            badgeName.setText(badge.badgeName)
            badgeRarity.setText(badge.badgeRarity)
        }
    }
}