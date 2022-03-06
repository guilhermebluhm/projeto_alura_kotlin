package com.kot.service

import com.kot.model.contaCorrente
import com.kot.repositories.OperacoesContaCorrente

class contaCorrenteServiceCliente : OperacoesContaCorrente {
    override fun persistirSaldoContaCorrente(c: contaCorrente,d: Double): Unit {
        if(d < 0){
            println("impossivel setar saldo negativo")
        }
        c.saldoConta += d;
    }

    override fun realizarSaqueContaCorrenteCliente(c: contaCorrente, d: Double) {
        if(d > c.saldoConta){
            println("impossivel realizar um saque maior que a disponibilidade da conta")
            return
        }
        val tx_saque = (d*0.02)
        c.saldoConta -= d + tx_saque
    }

    override fun realizarTransferenciaSaldoEntreContas(c1: contaCorrente, c2: contaCorrente, d: Double) {
        if(d > c1.saldoConta){
            println("impossivel transferir saldo insuficiente")
            return
        }
        c1.saldoConta -= d
        c2.saldoConta += d
    }
}