fun main() {
    println("Factorial 9999 is: ${factorial(9999)}")
}


tailrec fun factorial(n: Int, result: Int = 1): Int { //tairec digunakan agar meminimalisir penumpukan frame ketika kita menerapkan recursive
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial(n - 1, newResult)
    }
}
