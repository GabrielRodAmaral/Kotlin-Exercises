package Functions

/*
    Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas, minutos e
    segundos. Saída desejada:
    2 anos equivalem a:
    24 meses
    730 dias
    17520 horas
    1051200 minutos
    63072000 segundos
 */

fun main() {

    convertTime(2)
}

fun convertTime(years: Int) {
    println("""
        $years anos equivalem a:
        ${years * 12} meses
        ${years * 365} dias
        ${years * 365 * 24} horas
        ${years * 365 * 24 * 60} minutos
        ${years * 365 * 24 * 60 * 60} segundos
    """.trimIndent())
}