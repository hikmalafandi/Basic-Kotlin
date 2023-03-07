fun vehicle() = mapOf<String, String>(
    "type" to "motorcycle",
    "maxSpeed" to "230Km/s",
    "maxTank" to "100Ltr"
)

fun main() {
    println("""
        My Map Result:
        ${vehicle()}
    """.trimIndent())
}