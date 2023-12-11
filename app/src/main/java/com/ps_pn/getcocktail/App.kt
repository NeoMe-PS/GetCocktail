package com.ps_pn.getcocktail

import android.app.Application
import com.ps_pn.getcocktail.di.DaggerMainComponent
import com.ps_pn.getcocktail.di.MainComponent

class App : Application() {


    val component:MainComponent by lazy {
        DaggerMainComponent.factory().create(this)
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }


}