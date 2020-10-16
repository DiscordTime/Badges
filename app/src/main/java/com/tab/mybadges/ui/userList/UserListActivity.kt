package com.tab.mybadges.ui.userList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tab.mybadges.MockUserList
import com.tab.mybadges.R
import com.tab.mybadges.databinding.ActivityUserListBinding
import com.tab.mybadges.entities.User

class UserListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserListBinding

    private lateinit var recyclerViewUserList: RecyclerView
    private lateinit var recyclerViewUserListAdapter: RecyclerView.Adapter<UserListAdapter.ViewHolder>
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerViewUserList = binding.rvUserList

        recyclerViewUserListAdapter =
            UserListAdapter(
                MockUserList.createMockedList(),
                R.layout.user_list_rv_item
            )
        recyclerViewUserList.adapter = recyclerViewUserListAdapter



        layoutManager = LinearLayoutManager(this)
        recyclerViewUserList.layoutManager = layoutManager
    }


}