package Functions

/*
    Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.
 */

fun main() {

    val stringToConvert = "Gabriel"
    println(chars(stringToConvert))
}

fun chars(str: String): Int = str.length