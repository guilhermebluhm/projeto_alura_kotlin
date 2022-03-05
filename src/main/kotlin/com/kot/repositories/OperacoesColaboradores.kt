package com.kot.repositories

import com.kot.model.Desenvolvedor
import com.kot.model.Funcionario

interface OperacoesColaboradores {

    fun bonificacao(f1: Funcionario, f2: Desenvolvedor, d: Double) : Unit

}