package com.viperarch.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.viperarch.EXTRA_STATUS
import com.viperarch.R
import com.viperarch.presenter.FeedbackPresenter
import com.viperarch.presenter.FeedbackPresenterImpl
import kotlinx.android.synthetic.main.activity_feedback.*

class FeedbackViewImpl: AppCompatActivity(), FeedbackView {

    private var presenter: FeedbackPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)

        presenter = FeedbackPresenterImpl(this)
        presenter?.onActivityCreated(intent.getIntExtra(EXTRA_STATUS, 0))
    }

    override fun setDrawMessage() {
        tv_feedback.text = getString(R.string.label_feedback_draw)
    }

    override fun setLoseMessage() {
        tv_feedback.text = getString(R.string.label_feedback_lose)
    }

    override fun setWinMessage() {
        tv_feedback.text = getString(R.string.label_feedback_win)
    }

}