package com.viperarch.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.viperarch.R
import com.viperarch.presenter.JaKenPoPresenter
import com.viperarch.presenter.JaKenPoPresenterImpl
import kotlinx.android.synthetic.main.activity_main.*

class JaKenPoViewImpl : AppCompatActivity(), JaKenPoView {

    private var presenter: JaKenPoPresenter? = null

    override fun initializeListeners() {
        bt_paper.setOnClickListener { presenter?.paperButtonClicked() }
        bt_rock.setOnClickListener { presenter?.rockButtonClicked() }
        bt_scissor.setOnClickListener { presenter?.scissorButtonClicked() }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = JaKenPoPresenterImpl(this)
        initializeListeners()
    }

    override fun onDestroy() {
        presenter?.unregister()

        super.onDestroy()
    }
}
