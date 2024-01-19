package DecisionStructures

/*
    Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no final do ano.
    Os bônus são classificados por cargo.

    a. Gerentes recebem R$2000,00
    b. Coordenadores recebem R$1500,00
    c. Engenheiros de software recebem R$1000,00
    d. Estágiarios recebem R$500,00
 */

fun main() {

    println(bonus("Gerente"))
}

fun bonus(position: String): Float {
    return when (position) {
        "Gerente" -> 2000.00f
        "Coordenador" -> 1500.00f
        "Engenheiro de software" -> 1000.00f
        "Estágiario" -> 500.00f
        else -> 0f
    }
}