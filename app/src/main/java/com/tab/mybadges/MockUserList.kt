package com.tab.mybadges

import com.tab.mybadges.entities.User

object MockUserList {
    fun createMockedList(): ArrayList<User> {
        val photo = R.drawable.ic_user_photo_24
        var name = "Thiago"
        var projectName = "Secrect Project"
        var i = 0

        var userList = listOf<User>().toMutableList()
        for(i in 0 until 30) {
            val user = User(photo, name + i, projectName)
            userList.add(i, user)
        }
        return userList as ArrayList<User>
    }
}