package com.emrys.daggerhiltlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emrys.daggerhiltlab.data.RetrofitService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var myAwesomeHelper: MyAwesomeHelper
    @Inject lateinit var retrofitService: RetrofitService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        myAwesomeHelper.doAwesomeThings()
        // retrofitService is ready to use here.
    }
}

class MyAwesomeHelper @Inject constructor() {
    fun doAwesomeThings() {
        // this method does amazing things
    }
}