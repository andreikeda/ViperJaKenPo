package com.viperarch.presenter

import com.viperarch.view.FeedbackView

class FeedbackPresenterImpl(var view: FeedbackView?) : FeedbackPresenter {

    override fun onActivityCreated(status: Int) {
        when (status) {
            -1 -> view?.setLoseMessage()
            0 -> view?.setDrawMessage()
            1 -> view?.setWinMessage()
        }
    }

    override fun unregister() {
        view = null
    }

}