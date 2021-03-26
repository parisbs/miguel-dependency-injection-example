package com.example.dependencyinjection.clases

class D(
    private val a: A,
    private val b: B
) {
    fun saludame(apellido: String): String {
        return "${a.saludame()} $apellido"
    }
    fun despideme(apellido: String): String {
        return "${b.despideme()} $apellido"
    }
}