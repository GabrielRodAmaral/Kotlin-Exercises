package RepeatingStructures

/*
    Ana e Paula são duas programadoras da empresa XPTO. A empresa XPTO possui um benefício para incentivar os funcionários
    a pouparem dinheiro para a aposentadoria que funciona da seguinte maneira:
    Se o funcionário destinar 5% do seu salário para o investimento, a empresa acrescenta o mesmo valor.
    Ou seja, caso o funcionário invista 100 reais, a empresa investe mais 100.
    Este fundo de investimento possui rendimento de 0,2% ao mês.

    Ana adorou a ideia e vai investir. No entanto, Paula decidiu que vai investir os mesmos 5% por conta própria já que
    conhece investimentos que rendem mais que 0,2% ao mês. Paula vai escolher investimentos que rendem 0,8% ao mês.
    Considere o salário de Ana e Paula iguais e no valor de 10 mil reais e que as duas estão começando com saldo 0 e
    que investirão 5% do salário.

    Em quantos meses o patrimônio de Paula vai superar o patrimônio de Ana?
 */

fun main() {

    val wage = 10000.0
    var balanceAna = 0.0
    var balancePaula = 0.0
    val contributionAna = wage * 0.10
    val contributionPaula = wage * 0.05
    var month = 0

    do {
        balanceAna += contributionAna + (balanceAna * 0.002)
        balancePaula += contributionPaula + (balancePaula * 0.008)
        month++
    } while (balancePaula <= balanceAna)

    println("O patrimônio de Paula superou o de Ana em $month meses.")
}