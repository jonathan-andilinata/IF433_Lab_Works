package oop_00000108980_JonathanAndilinata.week07

fun main (){

    println("\n=== TEST Regular Class ===")
    val reg1 = RegularUser("Alice",22)
    val reg2 = RegularUser("Alice",22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")
}