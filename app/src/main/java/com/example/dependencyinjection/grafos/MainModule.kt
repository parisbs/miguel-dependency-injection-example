package com.example.dependencyinjection.grafos

import com.example.dependencyinjection.main.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    viewModel<MainViewModel> {
        MainViewModel(
                get(),
                get(),
                get(),
                get()
        )
    }
}