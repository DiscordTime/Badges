package com.tab.mybadges.ui.badgeList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tab.mybadges.databinding.ActivityBadgeListBinding

class BadgeListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBadgeListBinding
    private lateinit var badgeListViewModel: BadgeListViewModel

    private lateinit var recyclerViewBadgeList: RecyclerView
    private lateinit var recyclerViewBadgeListAdapter: BadgeListAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBadgeListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        observeBadgeList()
        recyclerViewBadgeList.adapter = recyclerViewBadgeListAdapter
        recyclerViewBadgeList.layoutManager = layoutManager
    }

    private fun init() {
        badgeListViewModel = BadgeListViewModel()
        layoutManager = LinearLayoutManager(this)
        recyclerViewBadgeList = binding.rvBadgeList
        recyclerViewBadgeListAdapter =
            BadgeListAdapter(
                arrayListOf()
            )
    }

    private fun observeBadgeList() {
        badgeListViewModel.getBadges().observe(this, Observer {
            recyclerViewBadgeListAdapter.setBadgeList(it)
        })
    }
}