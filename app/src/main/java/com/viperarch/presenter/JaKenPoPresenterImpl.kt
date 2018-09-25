package com.viperarch.presenter

import android.app.Activity
import com.viperarch.entity.JaKenPoEntity
import com.viperarch.interactor.JaKenPoInteractor
import com.viperarch.interactor.JaKenPoInteractorImpl
import com.viperarch.router.JaKenPoRouter
import com.viperarch.router.JaKenPoRouterImpl
import com.viperarch.view.JaKenPoView

class JaKenPoPresenterImpl(var view: JaKenPoView?) : JaKenPoPresenter {

    private var interactor: JaKenPoInteractor? = JaKenPoInteractorImpl(this)
    private var router: JaKenPoRouter? = JaKenPoRouterImpl(view as Activity)

    override fun onResultReceived(status: Int) {
        router?.goToFeedbackScreen(status)
    }

    override fun paperButtonClicked() {
        interactor?.verifyStatus(JaKenPoEntity.Paper)
    }

    override fun rockButtonClicked() {
        interactor?.verifyStatus(JaKenPoEntity.Rock)
    }

    override fun scissorButtonClicked() {
        interactor?.verifyStatus(JaKenPoEntity.Scissors)
    }

    override fun unregister() {
        interactor?.unregister()
        interactor = null
        router?.unregister()
        router = null
        view = null
    }

}