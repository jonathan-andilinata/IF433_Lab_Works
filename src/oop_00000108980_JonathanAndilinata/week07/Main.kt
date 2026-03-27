package oop_00000108980_JonathanAndilinata.week07

fun main (){

    println("\n=== TEST Data Class ===")
    val data1 = RegularUser("Alice",22)
    val data2 = RegularUser("Alice",22)
    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("hasil copy $data3")

    val (name, age) = data1
    println("Destructured $name berumur $age")
}