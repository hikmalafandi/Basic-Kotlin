fun main() {
    //Sequence adalah salah satu Collection sepertinya list, set dan map
    // Bedanya Sequence merupakan collection yang termasuk lazy evaluation sedangkan list, set dan map merupakan eager evaluation
    // eager evaluation akan mengevaluasi seluruh item pada collection secara menyeluruh atau secara horizontal
    // lazy evaluation akan mengevaluasi item pada collection tidak secara menyeluruh sesuai kondisi yang terpenuhi saja atau dilakukan secara vertikal
    // contoh eager evaluation pada kasus dibawah akan mengevaluasi item dengan filter dan map walaupun ketika kondisi filter tidak terpenuhi
    // contoh lazy evaluation pada kasus dibawah akan mengevaluasi item dengan filter dan map walaupun ketika kondisi filter terpenuhi saja jika filter tidak tipenuhi maka akan dilewat

    //contoh yang menggunakan eager evaluation
    //val list = (1..100).toList()
    //list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    //contoh sequence atau menggunakan lazy eveluation
    //var list1 = (1..100).toList()
    //list1.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    var sequenceNumber = generateSequence(1) { it + 1 } //untuk membuat objek sequence atau memebuat collection sequence
    sequenceNumber.take(5).forEach { println(it) } // take berfungsi secara batas maksimal dari banyaknya item collection sequence

    var sequenceNumber2 = generateSequence(1) { it + 1 }
    sequenceNumber2.take(10).filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
}