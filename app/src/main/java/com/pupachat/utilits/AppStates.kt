package com.pupachat.utilits

import com.pupachat.database.*

enum class AppStates(val states: String) {
    ONLINE("в сети"),
    OFFLINE("был(а) недавно"),
    TYPING("печатает");

    companion object{
        fun updateState(appStates: AppStates){
            if (AUTH.currentUser != null){
                REF_DATABASE_ROOT.child(NODE_USERS).child(
                    CURRENT_UID
                ).child(CHILD_STATE)
                    .setValue(appStates.states)
                    .addOnSuccessListener { USER.state = appStates.states}
                    .addOnFailureListener { showToast(it.message.toString()) }
            }
        }
    }
}