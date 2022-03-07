package com.kot.service

import com.kot.model.Desenvolvedor
import com.kot.model.Funcionario
import com.kot.model.Gerente
import com.kot.model.contaAdmin
import com.kot.repositories.OperacoesColaboradores
import valorTotalBonificacaoPaga
import java.lang.IllegalArgumentException
import java.time.LocalDate
import java.time.Period

class ServiceColaboradores : OperacoesColaboradores {
    override fun bonificacao(f1: contaAdmin, f2: Desenvolvedor, d: Double): Unit {
        if(f1 is Gerente){
            if(f1.getSenha().equals("12345")){
                println("ok - autorização registrada")
                if(d < 0){
                    throw IllegalArgumentException("ERRO")
                }
                valorTotalBonificacaoPaga(d*f2.salario)
                f2.salario = f2.salario + (f2.salario * d)
                return
            }
        }
        println("não há permissao para solicitar aumento")
    }

    override fun aplicarPLR(f1: contaAdmin) {
        if(f1 is Gerente){
            var r = Period.between(f1.dataAdmissao,LocalDate.now(),)
            if(r.years >= 1){
                println("PLR sendo processado para pagamento")
            }
        }
    }

    override fun fazerLogin(f1: contaAdmin) : String{
        if(f1.getPermissoesLogin()){
            return "ok"
        }
        return "erro"
    }
}