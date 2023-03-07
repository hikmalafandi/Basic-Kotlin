fun main() {
    //HighOrderFunction adalah Function yang parameternya adalah lambda atau function

    println(HighOrderFunction("Hikmal", {nama : String -> nama})) //cara 1
    var result = HighOrderFunction("Afandi") {nama : String ->    //cara2
        nama
    }

    println(result)

    printResult(10 ,sum)
}

fun HighOrderFunction(value : String, nama : (String) -> String) : String {
    val valueNama = nama(value)
    return "Hello $valueNama"
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

var sum: (Int) -> Int = { value -> value + value }