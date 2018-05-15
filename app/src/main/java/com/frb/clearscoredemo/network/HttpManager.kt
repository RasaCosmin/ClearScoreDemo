package com.frb.clearscoredemo.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Rasa Cosmin on 15.05.2018.
 */
object HttpManager{

    var apiRequest : ApiRequest = Retrofit.Builder()
            .baseUrl("https://5lfoiyb0b3.execute-api.us-west-2.amazonaws.com/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiRequest::class.java)

}