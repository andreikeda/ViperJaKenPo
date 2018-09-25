package com.viperarch.interactor

import com.viperarch.entity.JaKenPoEntity
import com.viperarch.presenter.JaKenPoPresenter
import java.util.*

class JaKenPoInteractorImpl(var output: JaKenPoPresenter?) : JaKenPoInteractor {

    override fun verifyStatus(entity: JaKenPoEntity) {
        val opponent = Random().nextInt(JaKenPoEntity.values().size)
        if (entity == JaKenPoEntity.values()[opponent]) {
            output?.onResultReceived(0)
        } else {
            when (JaKenPoEntity.values()[opponent]) {
                JaKenPoEntity.Rock -> {
                    if (entity == JaKenPoEntity.Scissors) {
                        output?.onResultReceived(-1)
                    } else {
                        output?.onResultReceived(1)
                    }
                }
                JaKenPoEntity.Paper -> {
                    if (entity == JaKenPoEntity.Scissors) {
                        output?.onResultReceived(1)
                    } else {
                        output?.onResultReceived(-1)
                    }
                }
                JaKenPoEntity.Scissors -> {
                    if (entity == JaKenPoEntity.Rock) {
                        output?.onResultReceived(1)
                    } else {
                        output?.onResultReceived(-1)
                    }
                }
            }
        }
    }

    override fun unregister() {
        output = null
    }

}