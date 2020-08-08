package com.emrys.daggerhiltlab.di

import com.emrys.daggerhiltlab.MainActivity
import com.emrys.daggerhiltlab.di.module.NetworkModule
import dagger.Component

@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}