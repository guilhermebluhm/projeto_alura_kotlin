package com.kot.model

import java.time.LocalDate

class contaCorrente(nomeCliente: String, dataAberturaConta: LocalDate, identCliente : Int, val end: enderecoCliente)
    : conta(nomeCliente,dataAberturaConta,identCliente) {
    var saldoConta : Double = 0.00
    set
    get() {
        return field
    }
}