package com.example.dependencyinjection.grafos

import com.example.dependencyinjection.clases.*
import org.koin.dsl.module

val clasesModule = module {
    single<A> {
        A("Miguel")
    }
    single<C> {
        C(
                get()
        )
    }
    single<D> {
        D(
                get(),
                B("John")
        )
    }
    single<E> {
        E(
                "Barraza",
                get()
        )
    }
}