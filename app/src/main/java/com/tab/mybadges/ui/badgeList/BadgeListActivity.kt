package com.tab.mybadges.ui.badgeList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tab.mybadges.MockBadgeListViewModel
import com.tab.mybadges.R
import com.tab.mybadges.databinding.ActivityBadgeListBinding
import com.tab.mybadges.ui.userList.UserListAdapter

class BadgeListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBadgeListBinding

    private lateinit var recyclerViewBadgeList: RecyclerView
    private lateinit var recyclerViewBadgeListAdapter: BadgeListAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBadgeListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerViewBadgeList = binding.rvBadgeList
        recyclerViewBadgeListAdapter =
            BadgeListAdapter(
                arrayListOf()
            )
        observeBadgeList()
        recyclerViewBadgeList.adapter = recyclerViewBadgeListAdapter

        layoutManager = LinearLayoutManager(this)
        recyclerViewBadgeList.layoutManager = layoutManager
    }

    private fun observeBadgeList() {
        MockBadgeListViewModel.createMockedBadgeListLiveData().observe(this, Observer {
            recyclerViewBadgeListAdapter.setBadgeList(it)
        })
    }
}