package com.example.pranksnapchat

import android.graphics.Color

class Snap (
    val username: String,
    val timeSent: String,
    val profilePicResourceId: Int,
    var opened:Boolean) {

    val snapStatus:String
        get() = if(opened) "Recieved" else "New Snap"

    val snapStatusIconResourceId:Int
        get() = if(opened) R.drawable.emptysnap else R.drawable.filledsnap

    val snapStatusTextColor:Int
        get() = if(opened) Color.GRAY else Color.parseColor("#F60047")
}