package com.viperarch.interactor

import com.viperarch.entity.JaKenPoEntity

interface JaKenPoInteractor {

    /**
     * Method that contains business logic for checking if user won, draw or lost.
     *
     * @param: entity - enum that represents user choice.
     */
    fun verifyStatus(entity: JaKenPoEntity)

    /**
     * Method to dispose all variables when summoner Presenter is destroyed.
     */
    fun unregister()

}