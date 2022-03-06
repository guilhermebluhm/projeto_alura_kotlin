package com.kot.repositories

import com.kot.model.Desenvolvedor
import com.kot.model.Funcionario
import com.kot.model.contaAdmin

interface OperacoesColaboradores {

    fun bonificacao(f1: contaAdmin, f2: Desenvolvedor, d: Double) : Unit
    fun aplicarPLR(f1: contaAdmin) : Unit
    fun fazerLogin(f1: contaAdmin) : String

}