class ClassMobil(val Roda : String, val Pintu : String, val Kaca : String) {
    fun Maju() {
       println("Ayo Maju")
    }

    fun Mundur() {
        println("Ayo Mundur")
    }
}

fun main() {
    val mobil = ClassMobil("Ban", "2", "5")
    println("Roda   : ${mobil.Roda}")
    println("Pintu  : ${mobil.Pintu}")
    println("Kaca   : ${mobil.Kaca}")
    mobil.Maju()
    mobil.Mundur()
}