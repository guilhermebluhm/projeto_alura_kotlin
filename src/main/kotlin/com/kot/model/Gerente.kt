package com.kot.model

import senhaPermissaoAumentoSalario

class Gerente(nomePessoa: String, identFuncionario: Int, enderecoFuncionario: enderecoCliente, var salGerente : Double, var cargoGerente: String) : Funcionario(nomePessoa, identFuncionario, enderecoFuncionario) {

    fun getSenha() : String{
        return senhaPermissaoAumentoSalario()
    }

}