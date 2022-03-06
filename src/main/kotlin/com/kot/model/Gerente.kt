package com.kot.model

import senhaPermissaoAumentoSalario
import java.time.LocalDate

class Gerente(nomePessoa: String, identFuncionario: Int, enderecoFuncionario: enderecoCliente, flagLogin : Boolean, var salGerente : Double, var cargoGerente: String, val dataAdmissao: LocalDate) : contaAdmin(nomePessoa, identFuncionario, enderecoFuncionario, flagLogin) {

    fun getSenha() : String{
        return senhaPermissaoAumentoSalario()
    }

}