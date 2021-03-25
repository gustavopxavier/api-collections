package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(2000.0, 4000.0, 6000.0)

    for (salario in salarios){
        println(salario)
    }

    println("--------------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salário: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("--------------------")

    salariosMaiorQue2500.forEach{ println(it)}

    println("--------------------")
    println(salarios.count{ it in 2000.0..5000.0 })

    println("--------------------")
    println(salarios.find{ it == 2000.0 })

    println("--------------------")
    println(salarios.any { it == 2000.0 })

}