package oop_00000108980_JonathanAndilinata.week03

fun main(){
    val e = Employee("Budi")
    e.salary = -1000
    e.salary = 500000
    println("Gaji: ${e.salary}")

    e.incresePerformance()

    //e.perfomanceRating = 5

    println("Pajak yang harus dibayar: ${e.tax}")

}