package com.frb.clearscoredemo.models

/**
 * Created by Rasa Cosmin on 15.05.2018.
 */
data class CoachingSummary(val activeTodo: Boolean,
                           val activeChat: Boolean,
                           val numberOfTodoItems: Int,
                           val numberOfCompletedTodoItems: Int,
                           val selected: Boolean)