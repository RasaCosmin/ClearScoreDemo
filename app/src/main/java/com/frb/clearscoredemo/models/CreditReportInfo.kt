package com.frb.clearscoredemo.models

/**
 * Created by Rasa Cosmin on 15.05.2018.
 */
data class CreditReportInfo(val score: Int,
                            val scoreBand: Int,
                            val clientRef: String,
                            val status: String,
                            val maxScoreValue: Int,
                            val minScoreValue: Int,
                            val monthsSinceLastDefaulted: Int,
                            val hasEverDefaulted: Boolean,
                            val monthsSinceLastDelinquent: Int,
                            val hasEverBeenDelinquent: Boolean,
                            val percentageCreditUsed: Int,
                            val percentageCreditUsedDirectionFlag: Int,
                            val changedScore: Int,
                            val currentShortTermDebt: Int,
                            val currentShortTermNonPromotionalDebt: Int,
                            val currentShortTermCreditLimit: Int,
                            val currentShortTermCreditUtilisation: Int,
                            val changeInShortTermDebt: Int,
                            val currentLongTermDebt: Int,
                            val currentLongTermNonPromotionalDebt: Int,
                            val currentLongTermCreditLimit: Any,
                            val currentLongTermCreditUtilisation: Any,
                            val changeInLongTermDebt: Int,
                            val numPositiveScoreFactors: Int,
                            val numNegativeScoreFactors: Int,
                            val equifaxScoreBand: Int,
                            val equifaxScoreBandDescription: String,
                            val daysUntilNextReport: Int)
