fun main() {

    println("=================================================================================")
    println("Operations Filter and FilterNot")
    println("=================================================================================")
    //Operations Map berfungsi untuk memfilter isi collections sesuai kondisi
    var ListA = listOf(1,2,3,4,5,6,7,8,9,10)
    println("ListA = $ListA")
    var FilterListA = ListA.filter{it % 2 == 0}
    println("Hasil filter ListA dengan kondisi jika elemennya dimodulus 2 == 0 adalah $FilterListA")
    var NotFilterListA = ListA.filterNot {it % 2 == 0}
    println("Hasil not filter ListA atau kondisi sebaliknya dari filter adalah $NotFilterListA")

    println("=================================================================================")
    println("Operations Map")
    println("=================================================================================")
    //Operations Map berfungsi untuk membuat collections baru dengan kondisi tertentu
    var ListB = listOf(1,2,3,4,5,6,7,8,9,10)
    var hasilDikaliLima = ListB.map { it * 5 }
    println("ListB = $ListB")
    println("Hasil ListB dikali 5 adalah $hasilDikaliLima")

    println("=================================================================================")
    println("Operations Count")
    println("=================================================================================")
    //Operations Count berfungsi untuk menghitung jumalah elemen yang ada pada collections
    println("ListB = $ListB")
    println("Jumlah elemen pada ListB adalah " + ListB.count())

    //Pada operations count ditambahkan kondisi
    println("Jumlah elemen pada ListB yang merupakan kelipatan 3 adalah " + ListB.count{ it % 3 == 0 })

    println("=================================================================================")
    println("Operations find, firstOrNull, lastOrNull")
    println("=================================================================================")
    //find berfungsi untuk mencari elemen dalam collections jika elemen ditemukan maka akan langsung diberhentikan pencariannya
    //firstOrNull berfungsi untuk mencari elemen pertama sesuai kondisi dalam collections
    //lastOrNull berfungsi untuk mencari elemen terakhir sesuai kondisi dalam collections
    //Jika kondisi sudah sesuai maka akan berhenti dan akan menampilkan hanya satu nilai saja
    println("ListB = $ListB")
    var mencariBilanganGanjil = ListB.find { it % 2 == 1 }
    var mencariBilanganGanjil2 = ListB.firstOrNull {it % 2 == 1}
    var mencariBilanganGanjil3 = ListB.lastOrNull {it % 2 == 1}
    println(mencariBilanganGanjil)
    println(mencariBilanganGanjil2)
    println(mencariBilanganGanjil3)

    println("=================================================================================")
    println("Operations first, last")
    println("=================================================================================")
    //fungsi first dan last seperti firstOrNull dan lastOrNull bedanya jika tidak terdapat kondisi yang sesuai pada first dan last akan menghasilkan Exception
    println("ListB = $ListB")
    var mencariBilanganGanjil5 = ListB.first { it % 2 == 1 }
    var mencariBilanganGanjil6 = ListB.last { it % 2 == 1 }
    println(mencariBilanganGanjil5)
    println(mencariBilanganGanjil6)

    println("=================================================================================")
    println("Operations sum")
    println("=================================================================================")
    //fungsi sum hanya digunakan untuk angka yaitu untuk menjumlahkan semua elemen yang ada pada collections
    println("ListB = $ListB")
    var jumlah = ListB.sum()
    println("Hasil Penjumlahan semua elemen ListB adalah $jumlah")

    println("=================================================================================")
    println("Operations sorted")
    println("=================================================================================")
    //fungsi sorted digunakan untuk mengurutkan elemen yang ada pada collections
    //secara default akan diurutkan secara ascending
    // untuk descending menggunakan fungsi sortedDescending
    var listKotlin = listOf('k', 'o', 't', 'l', 'i', 'n')
    var ascendingListKotlin = listKotlin.sorted()
    var descendingListKotlin = listKotlin.sortedDescending()
    println("listKotlin = $listKotlin")
    println("listKotlin setelah diurutkan secara ascending = $ascendingListKotlin")
    println("listKotlin setelah diurutkan secara descending = $descendingListKotlin")

}