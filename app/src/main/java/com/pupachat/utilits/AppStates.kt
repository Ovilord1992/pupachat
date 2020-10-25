package com.pupachat.utilits

enum class AppStates(val states: String) {
    ONLINE("в сети"),
    OFFLINE("был недавно"),
    TYPING("печатает");

    companion object{
        fun updateState(appStates: AppStates){
            if (AUTH.currentUser != null){
                REF_DATABASE_ROOT.child(NODE_USERS).child(CURRENT_UID).child(CHILD_STATE)
                    .setValue(appStates.states)
                    .addOnSuccessListener { USER.state = appStates.states}
                    .addOnFailureListener { showToast(it.message.toString()) }
            }
        }
    }
}