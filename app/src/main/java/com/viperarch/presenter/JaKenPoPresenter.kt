package com.viperarch.presenter

interface JaKenPoPresenter {

    /**
     * Method to receive Interactor output.
     *
     * @param status: - [-1] - User lost<br>[0] - User drawn<br>[1] - User won
     */
    fun onResultReceived(status: Int)

    /**
     * Method to call Interactor passing enum Paper as parameter.
     *
     */
    fun paperButtonClicked()

    /**
     * Method to call Interactor passing enum Rock as parameter.
     *
     */
    fun rockButtonClicked()

    /**
     * Method to call Interactor passing enum Scissors as parameter.
     *
     */
    fun scissorButtonClicked()

    /**
     * Method to dispose all variables when summoner Presenter is destroyed.
     */
    fun unregister()

}