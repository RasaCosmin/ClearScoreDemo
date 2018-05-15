package com.frb.clearscoredemo.dashboard

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by Rasa Cosmin on 15.05.2018.
 */
class DashboardPresenterImpl(val dashboardView: DashboardContract.DashboardView, val apiRequest: DashboardContract.DashboardApi) :
        DashboardContract.DashboardPresenter {
    private fun onSuccess(score: Int) {
        dashboardView.hideWaiting()
        dashboardView.setCreditScore(score)
    }

    private fun onError(errorMsg: String?) {
        dashboardView.showError(errorMsg)
    }

    override fun getCreditScore() {
        dashboardView.showWaiting()
        apiRequest.requestCreditScore()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ response ->
                    onSuccess(response.creditReportInfo.score)
                },
                        { e ->
                            onError(e.message)
                        })
    }

}