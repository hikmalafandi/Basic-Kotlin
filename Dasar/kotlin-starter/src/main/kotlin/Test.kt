fun main() {
    var x = 10
    var y = 20
    var test = if (y > x) "aku adalah test" else "aku salah maaf"
    println(test)

    var hari = "Senin"

    var hariIni = when (hari) {
        "Senin" -> println("Hari ini adalah hari Senin")
        "Selasa" -> println("Hari ini adalah hari Selasa")
        "Rabu" -> println("Hari ini adalah hari Rabu")
        else -> println("oke tiddak ada pilihan ternyata")
    }

    var Antara = 1..10 step 3
    var i = 3
    if (i in Antara) {
        println("Iya ada diantara 1 dan 10 ")
    } else {
        println("Tidak ada diantara 1 dan 10")
    }
    println(Antara.step)

    val ranges = 1..5
    for (i in ranges){
        println("value is $i!")
    }
}