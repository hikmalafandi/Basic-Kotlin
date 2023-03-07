fun main() {

    //Lambda
    var fullName : (String, String) -> String = { firstName : String, lastName : String ->
        var result = "$firstName $lastName"
        result

    }

    var fullname2 = {firstName : String, lastName : String -> "$firstName $lastName"}

    var printName : (String) -> String = { // jika parameter hanya satu bisa memakai it saja tidak perlu deklarasi parameter
        it
    }

    var methodReference : (String) -> String = ::toUpper // Jika ingin membuat lambda berdasarkan referensi fungsi

    var nama = fullName("Hikmal", "Afandi")
    println(nama)

    var nama2 = fullname2("Hikmal", "Afandi")
    println(nama2)

    var nama3 = printName("Hikmal")
    println(nama3)

    var nama4 = methodReference("hikmal")
    println(nama4)
}

fun toUpper(value: String): String = value.toUpperCase()