package com.example.dependencyinjection.clases

class E(
        private val apellido: String,
        private val d: D
) {
    fun saludameYDespideme(): String {
        return "${d.saludame(apellido)}, ${d.despideme(apellido)}"
    }
}