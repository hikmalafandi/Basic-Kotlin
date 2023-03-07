//Fold untuk melakukan perhitungan setiap nilai yang berada di dalam sebuah collection tanpa harus melakukan iterasi item
// Drop untuk memangkas elemen pada data collection
//Take untuk menyaring elemen pada data collection

fun main() {
    var data = listOf(1,2,3,4,5)

    println("===FOLD===")
    var contohFold = data.fold(10) { current, item  -> //current adalah angkat dalam parameter fold
        println("Current $current")                          // item adalah elemen listnya dari awal
        println("Item $item")
        current + item
    }
    println("Resul $contohFold")

    println("===DROP===")
    var contohDropDefault = data.drop(3) // Memangkas data dari indeks awal, jumlah data yang dihapus = paramater fungsi drop
    var contohDropLast = data.dropLast(3) // Memangkas data dari indeks akhir, jumlah data yang dihapus = paramater fungsi drop
    println("Contoh Drop Default = $contohDropDefault")
    println("Contoh Drop Last = $contohDropLast")

    println("===TAKE===")
    var contohTakeDefault = data.take(3) // Menyaring data dari indeks awal, jumlah data yang dihapus = paramater fungsi take
    var contohTakeLast = data.takeLast(3) // Menyaring data dari indeks akhir, jumlah data yang dihapus = paramater fungsi take
    println("Contoh Take Default == $contohTakeDefault")
    println("Contoh Take Last == $contohTakeLast")
}