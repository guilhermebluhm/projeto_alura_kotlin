package com.kot.repositories

import com.kot.model.contaCorrente

interface OperacoesContaCorrente {

    fun persistirSaldoContaCorrente(c: contaCorrente, d: Double) : Unit
    fun realizarSaqueContaCorrenteCliente(c: contaCorrente, d: Double) : Unit
    fun realizarTransferenciaSaldoEntreContas(c1: contaCorrente, c2: contaCorrente, d: Double) : Unit

}