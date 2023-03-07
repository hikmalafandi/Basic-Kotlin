fun <T> checkType(args: T): String {
    return when (args) {
        is Int -> "Yes String"
        is String -> "Yes String"
        is Boolean -> "Yes Boolean"
        is Double -> "Yes Double"
        is List<*> -> "Yes Collection List"
        is Map<*, *> -> "Yes Collection Map"
        else -> "Tidak ada tipe data yang cocok"
    }
}

fun main() {
    println(
        """
        '[10, 9, 8 , 6]' is List? ${checkType(listOf(10, 9, 8, 6))}
        'Dicoding Indonesia' is String? ${checkType("Dicoding Indonesia")}
        'True' is Boolean? ${checkType(true)}
        '10.01' is Double? ${checkType(10.01)}
    """.trimIndent()
    )
}