package com.kot.model

class enderecoCliente {

    var logradouro : String = ""
    private set
    get() {
        return field;
    }
    fun setLogradouroCliente(endereco: String){
        if(endereco.length <= 6 || endereco.isBlank()){
            println("impossivel gravar")
        }
        this.logradouro = endereco
    }
    var numeroResidencia : String = ""
        private set
        get() {
            return field;
        }
    fun setNumeroResidencia(numero: String){
        if(numero.length > 5 || numero.isBlank()){
            println("impossivel gravar")
        }
        this.numeroResidencia = numero
    }
}