package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 23
    values[2] = 30
    values[3] = 433
    values[4] = 50

    for (valor in values) {
        println(valor)
    }

    values.forEach {
        println(it)
    }

    for (index in values.indices) {
        println(values[index])
    }

    values.sort()
    for (valor in values) {
        println(valor)
    }
}