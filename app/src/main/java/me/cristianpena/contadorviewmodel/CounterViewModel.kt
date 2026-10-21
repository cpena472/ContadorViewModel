package me.cristianpena.contadorviewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    // Este es el ESTADO: el número que se muestra en pantalla
    var contador by mutableIntStateOf(0)
        private set

    fun sumar() {
        contador++
    }

    fun restar() {
        contador--
    }
}