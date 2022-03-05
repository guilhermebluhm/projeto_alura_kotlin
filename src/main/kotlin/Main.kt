import com.kot.model.Desenvolvedor
import com.kot.model.Funcionario
import com.kot.model.Gerente
import com.kot.model.enderecoCliente
import com.kot.service.ServiceColaboradores
import com.kot.service.enderecoServiceCliente

fun main() {

    val v = enderecoServiceCliente()
    val e = enderecoCliente()
    var e_gerente = enderecoCliente()
    v.gravarEnderecoCliente(e,"rua abc , 123 - bloco a","789")
    v.gravarEnderecoCliente(e_gerente,"rua xyz","541")

    /*
    val cnt1 = contaCorrente("bob", LocalDate.now(),1326,e)
    val ctn2 = contaCorrente("fernando", LocalDate.now(),1327,e)
    val opCnt = contaCorrenteServiceCliente()

    opCnt.persistirSaldoContaCorrente(cnt1,1000.00)
    opCnt.persistirSaldoContaCorrente(ctn2, 500.00)
    */

    val f1: Funcionario = Desenvolvedor("bob",211,e,"php junior",2000.00)
    val f2: Funcionario = Gerente("fernando",125,e_gerente,3500.00,"gerente administrativo")
    var administrativo = ServiceColaboradores()
    administrativo.bonificacao(f2, f1 as Desenvolvedor,0.2)
    println(f1.salario)
}