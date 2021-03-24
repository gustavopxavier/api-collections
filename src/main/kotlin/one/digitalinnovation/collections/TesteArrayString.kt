package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Xavier"
    nomes[2] = "Josenoi"

    for (nome in nomes) {
        println(nome)
    }

    println("------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Maria", "Zaza", "Pedro")

    println("------------------")
    nomes2.sort()
    nomes2.forEach { println(it) }
}