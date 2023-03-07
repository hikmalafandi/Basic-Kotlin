class ClassAnimal{
    var nama = "Meow"

    get() {
        println("get kepanggil")
        return field
    }

    set(value) {
        println("set kepanggil")
        field = value
    }

    fun terbang() {
        println("terbang")
    }
}

fun main() {
    var animal = ClassAnimal()
    println(animal.nama)
    animal.nama = "Moo"
    println(animal.nama)
}



