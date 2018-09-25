package com.viperarch.router

import android.app.Activity
import com.viperarch.startFeedbackActivity

class JaKenPoRouterImpl(var activity: Activity?) : JaKenPoRouter {

    override fun goToFeedbackScreen(status: Int) {
        activity?.startFeedbackActivity(status)
    }

    override fun unregister() {
        activity = null
    }

}