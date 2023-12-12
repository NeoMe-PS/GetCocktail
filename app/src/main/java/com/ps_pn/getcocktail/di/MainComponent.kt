package com.ps_pn.getcocktail.di

import android.app.Application
import android.provider.ContactsContract.Data
import com.ps_pn.getcocktail.App
import dagger.BindsInstance
import dagger.Component
import dagger.Component.Factory

@Component(modules = [DataComponent::class])
interface MainComponent {

    fun inject(application: App)


    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): MainComponent
    }
}