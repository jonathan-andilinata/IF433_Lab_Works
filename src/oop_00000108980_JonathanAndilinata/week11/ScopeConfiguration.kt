package oop_00000108980_JonathanAndilinata.week11

data class user(var name: String = "", var age: Int = 0)

fun main(){
    println("=== TEST APPLY ===")
    val user = user().apply{
        name = "Alex"
        age = 25
    }
    println(user)

    println("\n=== TEST ALSO ===")
    val numbers = mutableListOf(1,2,3)
    numbers.also{
        println("log sebelum ditambah: $it")
    }.add(4)
    println("Setelah ditambah: $numbers")

    println("\n=== TEST WITH ===")
    with(user){
        println("user detail -> Nama: $name, umur: $age")
    }
}