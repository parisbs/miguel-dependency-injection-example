package com.example.dependencyinjection.clases

class C(
    private val a: A
) {
    fun saludame(): String {
        return a.saludame()
    }
    fun queClaseSoy(): String {
        return "C"
    }
}