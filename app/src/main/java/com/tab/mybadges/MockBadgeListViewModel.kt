package com.tab.mybadges

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tab.mybadges.entities.Badge

object MockBadgeListViewModel: ViewModel() {
    fun createMockedBadgeListLiveData(): LiveData<List<Badge>> {
        var mutableBadgeList = MutableLiveData<List<Badge>>()
        val badgePhoto = R.drawable.ic_badge_photo_24
        var badgeName = "Badge Name"
        var badgeRarity = "rare"

        val badgeList = listOf<Badge>().toMutableList()
        for (i in 0 until 15) {
            val badge = Badge(badgePhoto, badgeName + i, badgeRarity)
            badgeList.add(badge)
        }

        mutableBadgeList.postValue(badgeList)
        return mutableBadgeList
    }
}