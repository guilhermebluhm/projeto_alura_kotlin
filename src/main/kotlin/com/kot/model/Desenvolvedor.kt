package com.kot.model

class Desenvolvedor(nomePessoa: String, identFuncionario: Int,
                    enderecoFuncionario: enderecoCliente, var cargoDev: String,
                    var salario: Double)
                    : Funcionario(nomePessoa,identFuncionario,enderecoFuncionario){
}