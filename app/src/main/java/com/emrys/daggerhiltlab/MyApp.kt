package com.emrys.daggerhiltlab

import android.app.Application
import com.emrys.daggerhiltlab.di.ApplicationComponent
import com.emrys.daggerhiltlab.di.DaggerApplicationComponent

class MyApp: Application() {

    val appComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.create()
    }
}