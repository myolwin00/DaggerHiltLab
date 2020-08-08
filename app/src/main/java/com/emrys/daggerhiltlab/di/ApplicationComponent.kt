package com.emrys.daggerhiltlab.di

import com.emrys.daggerhiltlab.MainActivity
import dagger.Component

@Component
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}