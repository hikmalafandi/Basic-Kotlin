import java.util.*

//Slice untuk memilih atau menyaring elemen pada data collections
//Distinct digunakan untuk menyaring elemen yang sama sehingga hanya satu elemen saja yang ditampilkan ketika terdapat dua elemen yang sama
//Chunked digunakan untuk memisahkan string menjadi bagian - bangian kecil berupa array dengan cara menggunakan function chunked dan variable yang dimasukkan adalah jumlah indeks pemisah

fun main() {
    var numbers = listOf(1,2,3,4,5,6,7,8,9,10)

    //Slice
    println("==========SLICE==========")
    var contohSlice = numbers.slice(3..5)
    println("Contoh Slice == $contohSlice")

    var contohSlice2 = numbers.slice(2..8 step 2)
    println("Contoh Slice 2 == $contohSlice") //menggunakan step

    var index = listOf(2,4,6,8)
    var contohSlice3 = numbers.slice(index)
    println("Contoh Slice 3 == $contohSlice3") //memilih indeks yang akan disaring dengan dimasukkan kedalam variable


    //Distinct
    println("==========DISTINCT==========")
    var numbers2 = listOf(1,2,3,1)
    var contohDistinct = numbers2.distinct()
    println("Contoh Distinct == $contohDistinct")

    println("")

    data class Item(val key : String, val value : Any)
    val item = listOf(
        Item("1", "Kotlin"),
        Item("2", "Python"),
        Item("3", "C++"),
        Item("4", "Golang"),
        Item("3", "Java"),
        Item("5", "Kotlin")
    )

    val contohDistinct2 = item.distinctBy { it.key }
    contohDistinct2.forEach{
        println("${it.key} with value ${it.value}")
    }

    println("")

    val contohDistinct3 = item.distinctBy { it.value }
    contohDistinct3.forEach{
        println("${it.key} with value ${it.value}")
    }

    println("")

    var text = listOf("A", "BB", "CCC", "D")
    var contohDistinct4 = text.distinctBy{  //Distinct yang digunakan untuk menyaring elemen dengan panjang elemen sama
        it.length
    }
    println("Contoh Distinct untuk menyaring elemen dengan jumalah sama = $contohDistinct4")

    //Chunked
    println("==========CHUNKED==========")
    var text2 = "HIKMAL"

    var contohChunked = text2.chunked(3)
    println("Contoh Chunked $contohChunked")

    val contohChunked2 = text2.chunked(3) {
        it.toString().lowercase() //memodifikasi string yang telah dipisah menjadi lowercase atau penulisan huruf kecil semua
    }

    println("Contoh Chunked dengan memodifikasi = $contohChunked2")

}