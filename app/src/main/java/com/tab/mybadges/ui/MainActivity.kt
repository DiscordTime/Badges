package com.tab.mybadges.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.tab.mybadges.R
import com.tab.mybadges.databinding.ActivityMainBinding
import com.tab.mybadges.databinding.ActivityUserListBinding
import com.tab.mybadges.ui.badgeList.BadgeListActivity
import com.tab.mybadges.ui.userList.UserListActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var btnUserList: Button
    private lateinit var btnBadgeList: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btnUserList = binding.btnUserList
        btnUserList.setOnClickListener { v: View ->
            val intent = Intent(this, UserListActivity::class.java)
            startActivity(intent)
        }

        btnBadgeList = binding.btnBadgeList
        btnBadgeList.setOnClickListener { v: View ->
            val intent = Intent(this, BadgeListActivity::class.java)
            startActivity(intent)
        }
    }
}