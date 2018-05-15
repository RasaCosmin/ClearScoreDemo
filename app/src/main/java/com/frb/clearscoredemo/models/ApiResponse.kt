package com.frb.clearscoredemo.models

/**
 * Created by Rasa Cosmin on 15.05.2018.
 */
data class ApiResponse(val accountIDVStatus: String,
                       val creditReportInfo: CreditReportInfo,
                       val dashboardStatus: String,
                       val personaType: String,
                       val coachingSummary: CoachingSummary,
                       val augmentedCreditScore: Any
)