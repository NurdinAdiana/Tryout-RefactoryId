fun main() {
//    input dan output
    hello("nurdin")
    hello("aDiaNa")
    hello()
    hello(" ")
}
fun hello(name: String=" ") {
    return when{
//        buat nama menjadi lowercase lalu di capitalize
        name != " "  -> println("Hello ${(name.toLowerCase()).capitalize()}!")
        name == "" -> println("Hello, World!")
        else  -> println("Hello, World!")
    }
}