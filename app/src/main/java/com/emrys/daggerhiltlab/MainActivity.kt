package com.emrys.daggerhiltlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emrys.daggerhiltlab.data.RetrofitService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var myAwesomeHelper: MyAwesomeHelper
    @Inject lateinit var retrofitService: RetrofitService

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as MyApp).appComponent.inject(this)
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