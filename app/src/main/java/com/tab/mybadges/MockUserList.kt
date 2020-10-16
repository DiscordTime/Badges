package com.tab.mybadges

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tab.mybadges.entities.User

object MockUserList: ViewModel() {
    fun createMockedListLiveData(): LiveData<List<User>> {
        val photo = R.drawable.ic_user_photo_24
        var name = "Thiago"
        var projectName = "Secrect Project"
        var i = 0

        var multableUserList = MutableLiveData<List<User>>()
        var userList = listOf<User>().toMutableList()
        for(i in 0 until 30) {
            val user = User(photo, name + i, projectName)
            userList.add(i, user)
        }
        multableUserList.postValue(userList)
        return multableUserList
    }
}