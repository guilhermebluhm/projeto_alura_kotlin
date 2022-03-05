package com.kot.repositories

import com.kot.model.enderecoCliente

interface SalvarEndereco {

    fun gravarEnderecoCliente(e: enderecoCliente, p1: String, p2: String) : Unit

}