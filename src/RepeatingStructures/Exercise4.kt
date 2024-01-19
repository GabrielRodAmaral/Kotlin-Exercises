package RepeatingStructures

/*
    Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo:

    a. Quando um número for divisível por 3, imprimir Buzz
    b. Quando um número for divisível por 5, imprimir Fizz
    c. Quando um número for divisível por 3 e 5, imprimir FizzBuzz
 */

fun main() {

    var i = 0
    while (i <= 50) {
        if (i % 3 == 0 && i % 5 != 0) {
            println("Buzz")
        } else if (i % 5 == 0 && i % 3 != 0) {
            println("Fizz")
        } else if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else {
            println(i)
        }
        i++
    }
}