fun main() {
    println("===================")
    println("Extension Functions")
    println("===================")
    10.printInt()
    println(10.plusThree())

    println("===================")
    println("Extension Properties")
    println("===================")
    println(10.slice)
}

//Extension Functions
fun Int.printInt() {
    println("value $this")
}

fun Int.plusThree(): Int {
    return this + 3
}

//Extension Properties
val Int.slice : Int
    get() = this / 2