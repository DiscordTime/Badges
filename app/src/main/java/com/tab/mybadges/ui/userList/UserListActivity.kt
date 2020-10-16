package com.tab.mybadges.ui.userList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tab.mybadges.MockUserList
import com.tab.mybadges.R
import com.tab.mybadges.databinding.ActivityUserListBinding

class UserListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserListBinding

    private lateinit var recyclerViewUserList: RecyclerView
    private lateinit var recyclerViewUserListAdapter: UserListAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerViewUserList = binding.rvUserList

        recyclerViewUserListAdapter =
            UserListAdapter(
                arrayListOf(),
                R.layout.user_list_rv_item
            )
        observeUserList()
        recyclerViewUserList.adapter = recyclerViewUserListAdapter

        layoutManager = LinearLayoutManager(this)
        recyclerViewUserList.layoutManager = layoutManager
    }

    private fun observeUserList() {
        MockUserList.createMockedListLiveData().observe(this, Observer {
            recyclerViewUserListAdapter.setUserList(it)
        })

    }
}