package com.frb.clearscoredemo.dashboard

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by Rasa Cosmin on 15.05.2018.
 */
/**
 * Implement the presenter for interaction with the View and the Api
 */
class DashboardPresenterImpl(val dashboardView: DashboardContract.DashboardView, val apiRequest: DashboardContract.DashboardApi) :
        DashboardContract.DashboardPresenter {

    /**
     * On Successful request hide waiting and set the received score to be displayed
     */
    private fun onSuccess(score: Int) {
        dashboardView.hideWaiting()
        dashboardView.setCreditScore(score)
    }


    private fun onError(errorMsg: String?) {
        dashboardView.showError(errorMsg)
    }

    /**
     * Method that show the waiting profess and handle the request with RxJava
     */
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