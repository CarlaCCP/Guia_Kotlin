import br.com.bytebank.modelo.Analista
import br.com.bytebank.modelo.CalculadoraBonificacao
import br.com.bytebank.modelo.Diretor
import br.com.bytebank.modelo.Gerente

fun testaFuncionarios() {
    // br.com.bytebank.modelo.Funcionario é algo abstrato
    val alex = Analista(
        "Alex",
        "9084980",
        2000.0

    )

    println("Nome ${alex.nome}")
    println("CPF ${alex.cpf}")
    println("Salario ${alex.salario}")
    println("Bonificação: ${alex.bonificacao()}")

    val fran = Gerente(
        "Fran",
        "4876945",
        3000.0,
        123456
    )

    println("Nome ${fran.nome}")
    println("CPF ${fran.cpf}")
    println("Salario ${fran.salario}")
    println("Bonificação: ${fran.bonificacao()}")

    if (fran.autentica(12345)) {
        println("Autenticou")
    } else {
        println("Falha")
    }

    val gui = Diretor(
        "Guilherme",
        "940956405",
        5000.0,
        843973,
        200
    )

    println("Nome ${gui.nome}")
    println("CPF ${gui.cpf}")
    println("Salario ${gui.salario}")
    println("Bonificação: ${gui.bonificacao()}")
    println("PLR: ${gui.plr}")
    if (gui.autentica(843973)) {
        println("Autenticou")
    } else {
        println("Falha")
    }

    val maria = Analista(
        "Maria",
        "6940568",
        12000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("Total: ${calculadora.total}")
}