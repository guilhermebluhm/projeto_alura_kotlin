package com.kot.service

import com.kot.model.Desenvolvedor
import com.kot.model.Funcionario
import com.kot.model.Gerente
import com.kot.repositories.OperacoesColaboradores

class ServiceColaboradores : OperacoesColaboradores {
    override fun bonificacao(f1: Funcionario, f2: Desenvolvedor, d: Double): Unit {
        if(f1 is Gerente){
            if(f1.getSenha().equals("12345")){
                println("ok - autorização registrada")
                f2.salario = f2.salario + (f2.salario * d)
                return
            }
        }
        println("não há permissao para solicitar aumento")
    }
}