fun main() {
    val i = 90

    if (i < 0) {
        println("kecil")
    } else if ((i > 0) && (i <= 60)) {
        println("sedang")
    } else if ((i > 60) && (i <= 100)) {
        println("besar")
    }

    var valueA = 0
    var valueB : Int
    var test : String = "Hikmal"
    var hikmal = test[0]
    println("huruf pertama dari $test adalah $hikmal")

    println("ini adalah $valueA")
    println("ini adalah " + valueA)

    while (valueA <= 5) {
        valueA++
        println("ini adalah angka " + valueA)
    }

    val line = """
        line1
        line2
        line3
        line4
        line5
    """.trimIndent()

    println(line)

    luasPersegi(5,6)

    var luas = luasPersegi2(6,5)
    println(luas)

    var array = arrayOf(1,2,3,4)
    //println(array[0])

    var x = 0
    while (x <= 3) {
        println(array[x])
        x++
    }



    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
}

fun luasPersegi(panjang : Int, lebar : Int ) {
    println(panjang * lebar)
}

fun luasPersegi2(panjang: Int, lebar: Int): Int{
    return (panjang * lebar)
}