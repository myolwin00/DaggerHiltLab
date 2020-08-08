package com.emrys.daggerhiltlab.data

import okhttp3.ResponseBody
import retrofit2.http.GET

interface RetrofitService {

    @GET("")
    fun fetchSomething(): Any
}