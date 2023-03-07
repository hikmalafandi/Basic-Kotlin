fun main() {
    var test1 = getNumber(10,20,30,40,50)
    println(test1)

    getNumber2("Persib", 10,20,30,40,50)


    getNumber3(10,20,30,40,50, nama3 = "Persib")  //Jika parameter vararg disimpan pertama pada fungsi maka untuk paramter selain itu harus pakai namaed argument seperti disamping

    var test4 = intArrayOf(1, 2, 3, 4, 5)
    getNumber(10, 20, 30, 40, *test4, 50)  // bisa memasukkan variable dengan tipe array kedalam parameter saat pemanggilan fungsi
    println(getNumber(getNumber(10, 20, 30, 40, *test4, 50)))
}

fun getNumber(vararg number : Int) : Int {  // karena memakai vararg maka number merupakan array
    return number.sum()
}

fun getNumber2(nama2: String, vararg number2 : Int) {
    println(nama2)
    println(number2.sum())
}

fun getNumber3(vararg number3: Int ,nama3: String) {
    println(nama3)
    println(number3.sum())
}