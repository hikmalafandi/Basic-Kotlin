//function references

fun main() {
    var angka = 1.rangeTo(10)
    var EvenNumber = angka.filter ( ::isEvenNumber)
    println(EvenNumber)

}

fun isEvenNumber(number : Int)= number % 2 == 0