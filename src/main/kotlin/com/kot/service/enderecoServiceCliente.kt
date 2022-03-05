package com.kot.service

import com.kot.model.enderecoCliente
import com.kot.repositories.SalvarEndereco

class enderecoServiceCliente : SalvarEndereco {
    public override fun gravarEnderecoCliente(e: enderecoCliente, p1: String, p2: String) {
        e.setLogradouroCliente(p1)
        e.setNumeroResidencia(p2)
    }
}