package com.viperarch.router

interface JaKenPoRouter {
    /**
     * Method to send user to feedback screen.
     *
     * @param status: [-1] - User lost<br>[0] - User drawn<br>[1] - User won
     */
    fun goToFeedbackScreen(status: Int)

    /**
     * Method to dispose all variables when summoner Activity is destroyed.
     */
    fun unregister()
}