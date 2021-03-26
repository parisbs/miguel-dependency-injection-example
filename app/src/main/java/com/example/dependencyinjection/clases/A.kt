package com.example.dependencyinjection.clases

class A(
    private val nombre: String
) {
    fun saludame(): String {
        return "Hola $nombre"
    }
}