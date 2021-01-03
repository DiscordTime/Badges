package com.tab.mybadges.ui.userList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tab.mybadges.MockUserList
import com.tab.mybadges.R
import com.tab.mybadges.databinding.FragmentUserListBinding

class UserListFragment : Fragment() {

    private lateinit var binding: FragmentUserListBinding

    private lateinit var recyclerViewUserList: RecyclerView
    private lateinit var recyclerViewUserListAdapter: UserListAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUserListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerViewUserList = binding.rvUserList

        recyclerViewUserListAdapter =
            UserListAdapter(
                arrayListOf(),
                R.layout.user_list_rv_item
            )
        observeUserList()
        recyclerViewUserList.adapter = recyclerViewUserListAdapter

        layoutManager = LinearLayoutManager(context)
        recyclerViewUserList.layoutManager = layoutManager
    }

    private fun observeUserList() {
        MockUserList.createMockedListLiveData().observe(this, Observer {
            recyclerViewUserListAdapter.setUserList(it)
        })
    }
}