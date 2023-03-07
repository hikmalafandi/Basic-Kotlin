fun main() {
    val fullName = getFullName(last = "Afandi", middle = "Nur Hikmal", first = "Muhammad")
    print(fullName)

    println()

    val fullname2 = getFullName2("Lionel", "Andres", "Messi")
    print(fullname2)

    //val fullname3 = getFullName()
    //val fullname4 = getFullName2()
}

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

fun getFullName2(
    first: String = "Kotlin",
    middle: String = " is ",
    last: String = "Awesome"): String {
    return "$first $middle $last"
}