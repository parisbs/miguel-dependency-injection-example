package com.example.dependencyinjection.clases

class B(
    private val nombre: String
) {
    fun despideme(): String {
        return "Adios $nombre"
    }
}