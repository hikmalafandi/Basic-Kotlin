fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    return valueA + (valueB - (valueC ?: 50))
}

fun result(result: Int): String {
    return "Result is ${result}"
}

fun main() {
    val valueA = 101
    val valueB = 52
    val valueC = 99

    val resultA = calculate(valueA, valueB, valueC)
    val resultB = calculate(valueA, valueB, null)

    println("""
        ${result(resultA)}
        ${result(resultB)}
    """.trimIndent())
}
//if (valueC != null) valueC else 7