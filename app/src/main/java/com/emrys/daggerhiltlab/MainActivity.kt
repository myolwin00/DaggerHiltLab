package com.emrys.daggerhiltlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var myAwesomeHelper: MyAwesomeHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as MyApp).appComponent.inject(this)
        super.onCreate(savedInstanceState)

        myAwesomeHelper.doAwesomeThings()
    }
}

class MyAwesomeHelper @Inject constructor() {
    fun doAwesomeThings() {
        // this method does amazing things
    }
}