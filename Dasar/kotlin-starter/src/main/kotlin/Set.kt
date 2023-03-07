fun main() {
    var Set1  = setOf(1,2,1,3,4,5)
    var Set2 = setOf(2,3,4,1,5,1)

    println("=================================================================================")
    println("LATIHAN SET")
    println("=================================================================================")
    println(Set1)
    println(Set2)
    println(Set1 == Set2) //walaupun urutan elemennya berbeda tapi set tetap dianggap sama
    println(5 in Set1)
    //set tidak bisa ada duplikasi pada elemennya
    println("=================================================================================")

    println("=================================================================================")
    println("MENGGABUNGKAN SET")
    println("=================================================================================")
    //untuk menggabungkan set menggunakan fungsi union
    var Set3 = setOf(5,6,7,8)
    var gabungan = Set1.union(Set3)
    println("Gabungan dari Set1 dan Set3 adalah $gabungan")
    println("=================================================================================")

    println("=================================================================================")
    println("IRISAN SET")
    println("=================================================================================")
    // untuk irisan dari set bisa menggunakan fungsi intersect
    var irisan = Set1.intersect(Set3)
    println("Irisan dari Set1 dan Set3 adalah $irisan")
    println("=================================================================================")

    println("=================================================================================")
    println("MENAMBAHKAN DAN MENGHAPUS SET")
    println("=================================================================================")
    //set termasuk immutable set
    // untuk menggunakan mutable set maka menggunakan fungsi mutableSet()
    //set hanya bisa ditambah dan dihapus tidak bisa DIUBAH
    //Menambahkan elemen dengan menggunakan fungsi add
    //Menghapus elemen dengan menggunakan fungsi remove
    var Set4 = mutableSetOf(1,2,3,4,5,"oke",'h')
    Set4.add("hikmal")
    Set4.remove(1)
    println(Set4)


}