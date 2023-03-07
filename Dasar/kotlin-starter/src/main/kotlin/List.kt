fun main() {
    var ListA = listOf(1,2,3,5)
    var ListB = listOf("hikmal", 'h', 1, 1.2, 100L)

    //println(ListA[0])
    //println(ListB[4])

    //list yang mutable atau bisa diubah - ubah datanya
    var ListC = mutableListOf(1,2,4,"hikmal",'h',true)

    //ListC.add('k') // menambahkan element baru pada akhir list
    //ListC.add(1, 6) //menambahkan elemen pada indeks 1
    //ListC[0] = (5) // mengganti indeks 0 menjadi 5
    ListC.removeAt(3) // menghapus indeks 3

    var i = 0
    while(i < 5) {
        println(ListC[i])
        i++
    }
}