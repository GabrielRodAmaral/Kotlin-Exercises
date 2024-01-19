package DecisionStructures

/*
    Escreva um programa pra ser usado na portaria de um evento

    a. Menores de idade não são permitidos. Mensagem: "Negado. Menores de idade não são permitidos".
    b. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum
    destes. Mensagem: "Negado. Convite inválido.".
    c. Convites premium e luxo começam com "XL". Convites comuns começam com "XT". Caso o
    código não esteja nos padrões, negar a entrada. Mensagem: "Negado. Convite inválido."
    d. Caso todos os critérios sejam satisfeitos, exibir "Welcome :)"
 */

fun main() {

    val g1 = Guest(17, "comum", "XT0653")
    val g2 = Guest(18, "premium", "FU5654")
    val g3 = Guest(18, "normal", "XL5454")
    val g4 = Guest(20, "luxo", "XL8990")

    g1.enter()
    g2.enter()
    g3.enter()
    g4.enter()
}

class Guest(private val age: Int, private val invite: String, private val inviteCode: String) {
    fun enter() {
        return if (age < 18 ||
            (invite != "comum" && invite != "premium" && invite != "luxo") ||
            (!inviteCode.startsWith("XT") && !inviteCode.startsWith("XL"))) {
            println("Negado. Convite inválido.")
        } else {
            println("Welcome :)")
        }
    }
}