fun main() {
    test("Hari ini Persibday")
    var test2 = messageLength("Hari Ini PersibDay")
    println(test2)
}

var test = {message : String -> println(message) }

var messageLength = {message : String -> message.length}