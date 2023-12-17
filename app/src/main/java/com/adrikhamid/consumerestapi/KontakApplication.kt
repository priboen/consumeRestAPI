package com.adrikhamid.consumerestapi

import android.app.Application
import com.adrikhamid.consumerestapi.repository.AppContainer
import com.adrikhamid.consumerestapi.repository.KontakContainer

class KontakApplication:Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container=KontakContainer()
    }
}