fun main() {
    var capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    // key to value
    // untuk mengakses valuenya menggunakan keynya seperti pada array mengakses elemen dengan indeksnya
    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    // perbedaan dengan tanpa fungsi getValue adalah ketika tidak ada key yang cocok maka akan keluar exception sedangkan yang tidak memakai fungsi getValue akan keluar null
    // contoh
    //println(capital["Amsterdam"])
   // println(capital.getValue("Amsterdam"))

    //untuk mengetahui semua key yang ada pada map menggunakan fungsi keys outputnya akan berupa set
    var mapKey = capital.keys
    println("Semua key yang ada pada map capital adalah $mapKey")

    //untuk mengetahui semua value atau nilai yang ada pada map menggunakan fungsi values outputnya akan berupa collection
    var mapValue = capital.values
    println("Semua value yang ada pada map capital adalah $mapValue")

    //mengubah map menjadi mutable
    var mutableCapital = capital.toMutableMap()

    //menambahkan key and value ke map
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
    println(mutableCapital)

    //Perhatian
    // Tidak disarankan mengguanakan collection yang muatble jadi sebisa mnugnkin mengguanakn immutable
    // Tapi jika terpaksa ya tidak apa - apa

}