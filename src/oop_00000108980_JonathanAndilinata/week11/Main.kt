package oop_00000108980_JonathanAndilinata.week11

fun main(){
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()} ")

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run{
        println("Memproses kata: ${this}")
        length * 2
    }
    println("Hasil kalkulasi kata: $result")

}