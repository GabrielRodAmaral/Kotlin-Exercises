package DecisionStructures

/*
    Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura geométrica. Informar
    se formam um quadrado (lados iguais)
 */

fun main() {

    print("Digite o primeiro número: ")
    val n1 = readln().toInt()
    println()
    print("Digite o segundo número: ")
    val n2 = readln().toInt()
    println()

    if (n1 == n2) {
        println("Os números formam um quadrado")
    } else {
        println("Os números não formam um quadrado")
    }
}