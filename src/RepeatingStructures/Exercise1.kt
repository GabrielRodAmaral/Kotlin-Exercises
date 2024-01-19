package RepeatingStructures

/*
    Imprima os números de 1 a 50 na mesma linha em ordem crescente, não imprima os números multiplos de 5.
 */

fun main() {

    for (i in 1..50) {
        if (i % 5 == 0) {
            continue
        }
        print("$i ")
    }
}