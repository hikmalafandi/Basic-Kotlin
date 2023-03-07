class User(val name : String, val age : Int) {
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

data class DataUser(val name : String, val age : Int) {
    fun intro() {
        println("Namaku $name aku berumur $age tahun")
    }
}

fun main(){
    val user = User("Hikmal", 20)
    val dataUser = DataUser("Hikmal", 20)

    println(user)
    println(dataUser)

    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    val dataUser4 = dataUser.copy()

    println(dataUser4)

    val dataUser5 = dataUser.copy(age = 21)

    println(dataUser5)

    //Menguraikan data class componen
    val name = dataUser2.component1()
    val age = dataUser2.component2()
    println(name)
    println(age)

    val(name3, age3) = dataUser3
    println("namaku adalah $name3 aku berumur $age3 tahun")

    dataUser2.intro()





}