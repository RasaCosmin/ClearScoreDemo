package com.frb.clearscoredemo.network

import com.frb.clearscoredemo.models.ApiResponse
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by Rasa Cosmin on 15.05.2018.
 */
/**
 * Interface for Retrofit Methods
 */
interface ApiRequest {
    @GET("prod/mockcredit/values")
    fun getScore() : Observable<ApiResponse>
}