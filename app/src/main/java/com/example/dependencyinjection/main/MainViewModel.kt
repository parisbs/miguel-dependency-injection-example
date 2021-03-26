package com.example.dependencyinjection.main

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dependencyinjection.clases.*

class MainViewModel(
        private val a: A,
        private val c: C,
        private val d: D,
        private val e: E
) : ViewModel() {
    private val valorA = MutableLiveData<String>()
    val saludoA: LiveData<String> get() = valorA
    private val valorC = MutableLiveData<String>()
    val saludoC: LiveData<String> get() = valorC
    private val valorD = MutableLiveData<String>()
    val saludoYdespedidaD: LiveData<String> get() = valorD
    private val valorE = MutableLiveData<String>()
    val saludoYDespedidaE: LiveData<String> get() = valorE
    init {
        valorA.postValue(
                a.saludame()
        )
        valorC.postValue(
                c.saludame()
        )
        valorD.postValue(
                d.despideme("Barraza")
        )
        valorE.postValue(
                e.saludameYDespideme()
        )
    }
}