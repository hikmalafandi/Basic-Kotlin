fun main() {

    //Scope Function Lambda receiver (this) run, with, apply
    //Scope Function Lambda argument (it) let, also

    println("=====RUN=====")
    var textRun = "Hikmal"
    var resultRun = textRun.run{
        var nama = this
        var ganti = this.replace("Hikmal", "Afandi")
        "Ganti nama dari $nama menjadi $ganti"
    }
    println("Result run : $resultRun")
    println("=============")
    println("\n")


    println("=====WITH=====")
    var textWith = "Hikmal"
    var resultWith = with(textWith) {
        "First character is ${this[0]} and last character is ${this[this.length-1]}"
    }
    println("Result With : $resultWith")
    println("==============")
    println("\n")


    println("=====APPLY=====")
    var textApply = StringBuilder().apply {
        append("Muhammad ")
        append("Nur ")
        append("Hikmal ")
        append("Afandi ")
    }
    println("Result Apply : $textApply")
    println("==============")
    println("\n")


    println("=====LET=====")
    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }
    println("===============")
    println("\n")


    println("=====ALSO=====")
    var textAlso = "Hikmal"
    var resultAlso = textAlso.also {
        println("Value Length -> ${it.length}")
        //"Value -> $it"
    }
    println("Result Also : $resultAlso")
    println("===============")
    println("\n")

}

