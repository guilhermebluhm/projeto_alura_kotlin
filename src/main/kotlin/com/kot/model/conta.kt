package com.kot.model

import java.time.LocalDate

open abstract class conta(var nomeCliente: String, val dataAberturaConta: LocalDate, var identCliente : Int = 1000) {

}
