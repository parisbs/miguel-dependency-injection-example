package com.example.dependencyinjection

import android.app.Application
import com.example.dependencyinjection.grafos.clasesModule
import com.example.dependencyinjection.grafos.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.koinApplication

class DependencyInjection : Application() {

    override fun onCreate() {
        super.onCreate()
        initDependencyInjection(this)
    }

    private fun initDependencyInjection(application: Application) {
        startKoin {
            androidContext(applicationContext)
            androidFileProperties()
            androidLogger()
            modules(
                    listOf(
                            clasesModule,
                            mainModule
                    )
            )
        }
    }
}