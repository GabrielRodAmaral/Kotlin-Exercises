package DecisionStructures

/*
    Escreva um programa capaz de ler três números inteiros que representam os lados de uma triângulo. Informar se é um
    triângulo equilátero (todos os lados iguais)
 */

fun main() {

    print("Digite o primeiro número: ")
    val n1 = readln().toInt()
    println()
    print("Digite o segundo número: ")
    val n2 = readln().toInt()
    println()
    print("Digite o terceiro número: ")
    val n3 = readln().toInt()
    println()

    if (n1 == n2 && n2 == n3) {
        println("Os números formam um triângulo equilátero")
    } else {
        println("Os números não formam um triângulo equilátero")
    }
}