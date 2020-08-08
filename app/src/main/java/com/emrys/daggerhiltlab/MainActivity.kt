package com.emrys.daggerhiltlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.emrys.daggerhiltlab.data.RetrofitService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MyViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.doSomething()
    }
}

class MyViewModel @ViewModelInject constructor(
        private val myAwesomeHelper: MyAwesomeHelper
): ViewModel() {

    fun doSomething() {
        myAwesomeHelper.doAwesomeThings()
    }

}

class MyAwesomeHelper @Inject constructor() {
    fun doAwesomeThings() {
        // this method does amazing things
        Log.d("MyAwesomeHelper", "I'm doing awesome things!")
    }
}