package com.tab.mybadges.ui.badgeList

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.tab.mybadges.MockBadgeList
import com.tab.mybadges.entities.Badge

class BadgeListViewModel: ViewModel() {
    fun getBadges(): LiveData<List<Badge>> {
        return MockBadgeList.createMockedBadgeListLiveData()
    }
}