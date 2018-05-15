package com.frb.clearscoredemo.dashboard

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.frb.clearscoredemo.R
import kotlinx.android.synthetic.main.activity_main.*

class DashboardActivity : AppCompatActivity(), DashboardContract.DashboardView {

    lateinit var dashboardPresenter: DashboardContract.DashboardPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Dashboard"

        dashboardPresenter = DashboardPresenterImpl(this, DashboardApiImpl())

        retry_btn.setOnClickListener { dashboardPresenter.getCreditScore() }
        retry_btn.performClick()
    }

    override fun showWaiting() {
        creditScoreVisibility(false)
        retry_btn.visibility = View.GONE
        error_msg.visibility = View.GONE
        progress_bar.visibility = View.VISIBLE
    }

    override fun hideWaiting() {
        creditScoreVisibility(true)
        retry_btn.visibility = View.GONE
        error_msg.visibility = View.GONE
        progress_bar.visibility = View.GONE
    }

    private fun creditScoreVisibility(showScore: Boolean) {

        val visible = if (showScore)
            View.VISIBLE
        else View.GONE

        score_progress_bar.visibility = visible
        score.visibility = visible
        credit_score_bottom_message.visibility = visible
        credit_score_top_message.visibility = visible
    }

    override fun setCreditScore(scoreValue: Int) {
        score_progress_bar.progress = scoreValue
        score.text = scoreValue.toString()
    }

    override fun showError(errorMsg: String?) {
        creditScoreVisibility(false)
        progress_bar.visibility = View.GONE
        retry_btn.visibility = View.VISIBLE
        error_msg.visibility = View.VISIBLE
        error_msg.text = errorMsg ?: "Unknown error"
    }
}
