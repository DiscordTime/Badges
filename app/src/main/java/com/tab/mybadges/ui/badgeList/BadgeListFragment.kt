package com.tab.mybadges.ui.badgeList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tab.mybadges.databinding.FragmentBadgeListBinding

class BadgeListFragment : Fragment() {

    private lateinit var binding: FragmentBadgeListBinding

    private lateinit var badgeListViewModel: BadgeListViewModel

    private lateinit var recyclerViewBadgeList: RecyclerView
    private lateinit var recyclerViewBadgeListAdapter: BadgeListAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBadgeListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        observeBadgeList()
        recyclerViewBadgeList.adapter = recyclerViewBadgeListAdapter
        recyclerViewBadgeList.layoutManager = layoutManager
    }

    private fun init() {
        badgeListViewModel = BadgeListViewModel()
        layoutManager = LinearLayoutManager(context)
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