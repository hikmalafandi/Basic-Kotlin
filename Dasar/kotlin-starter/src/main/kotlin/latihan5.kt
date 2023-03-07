import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun sum(valueA: Int, valueB: Int): Int {
    delay(3000L)
    return valueA + valueB
}

suspend fun multiple(valueA: Int, valueB: Int): Int {
    delay(2000L)
    return valueA * valueB
}

fun main() = runBlocking {
    println("Counting...")

    val resultSum = async { sum(10, 10) }
    val resultMultiple = async { multiple(20, 20) }

    println("Result sum: ${resultSum.await()}\n" +
            "Result multiple: ${resultMultiple.await()}")
}

