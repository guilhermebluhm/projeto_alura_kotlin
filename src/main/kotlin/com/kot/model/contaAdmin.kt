package com.kot.model

import concederPermissao
import revogarPermissoes

open abstract class contaAdmin(var nomePessoa: String, val identFuncionario: Int,
                               var enderecoFuncionario: enderecoCliente, val flagLogin : Boolean) {
    fun getPermissoesLogin() : Boolean{
        return concederPermissao()
    }
    fun revogarPermissaoLogin() : Boolean{
        return revogarPermissoes()
    }
}