package com.pupachat.ui.fragments

import androidx.fragment.app.Fragment
import com.pupachat.R
import com.pupachat.utilits.APP_ACTIVITY


class MainFragment : Fragment(R.layout.fragment_chats) {

    override fun onResume() {
        super.onResume()
        APP_ACTIVITY.title = "Pupa"
        APP_ACTIVITY.mAppDrawer.enableDrawer()
    }
}