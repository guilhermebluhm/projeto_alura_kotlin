package com.kot.model

import concederPermissao

open abstract class contaAdmin(var nomePessoa: String, val identFuncionario: Int,
                               var enderecoFuncionario: enderecoCliente, val flagLogin : Boolean) {
    fun getPermissoesLogin() : Boolean{
        return concederPermissao()
    }
}