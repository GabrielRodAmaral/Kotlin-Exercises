package RepeatingStructures

/*
    Escreva um programa capaz de receber um número inteiro N e imprimir uma escada de tamanho N usando o caracter #
 */

fun main() {

    print("Digite um número: ")
    val n = readln().toInt()
    println()

    var step = ""
    for (i in 1..n) {
        step += "#"
        println(step)
    }
}