package com.romanuriel.infoanime.data

import com.google.gson.annotations.SerializedName

data class BaseResult (
    @SerializedName("status")
    val status: Int,
    @SerializedName("tyep")
    val type: String,
    @SerializedName("message")
    val message: String,
    @SerializedName("error")
    val error: String,
    @SerializedName("report_url")
    val reportUrl: String)