package com.frb.clearscoredemo.dashboard

import com.frb.clearscoredemo.models.ApiResponse
import com.frb.clearscoredemo.network.ApiRequest
import io.reactivex.Observable


/**
 * Created by Rasa Cosmin on 15.05.2018.
 */
interface DashboardContract {
    interface DashboardView{
        fun showWaiting()
        fun hideWaiting()
        fun setCreditScore(scoreValue: Int)
        fun showError(errorMsg: String?)
    }

    interface DashboardPresenter{
        fun getCreditScore()
    }

    interface DashboardApi{
        fun requestCreditScore() : Observable<ApiResponse>
    }
}