package com.frb.clearscoredemo.dashboard

import com.frb.clearscoredemo.network.HttpManager

/**
 * Created by Rasa Cosmin on 15.05.2018.
 */
class DashboardApiImpl : DashboardContract.DashboardApi {
    override fun requestCreditScore() =
            HttpManager.apiRequest.getScore()


}