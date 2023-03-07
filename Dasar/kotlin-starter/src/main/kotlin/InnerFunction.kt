//Function Inside Function

fun main() {
    fun setWord(message: String) {
        fun printMessage() {
            println(message)
        }
        printMessage()
    }

    setWord("Hikmal")

    fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
        fun validateNumber(value: Int) {
            if (value == 0) {
                throw IllegalArgumentException("value must be better than 0")
            }
        }

        validateNumber(valueA)
        validateNumber(valueB)
        validateNumber(valueC)

        return valueA + valueB + valueC
    }

    println(sum(1,2,3))
}