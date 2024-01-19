package Functions

/*
    Escreva uma função capaz de receber milhas e converter em km (1 milha = 1.6km).
 */

fun main() {

    println(milesToKm(500.5))
}

fun milesToKm(miles: Double): Double = miles * 1.6