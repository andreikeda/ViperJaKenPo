package com.viperarch

import android.app.Activity
import android.content.Intent
import com.viperarch.view.FeedbackViewImpl

const val EXTRA_STATUS = "e_status"

fun Activity.startFeedbackActivity(status: Int) {
    val it = Intent(this, FeedbackViewImpl::class.java).apply {
        putExtra(EXTRA_STATUS, status)
    }
    startActivity(it)
}