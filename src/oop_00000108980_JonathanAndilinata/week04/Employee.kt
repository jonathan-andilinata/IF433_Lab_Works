package oop_00000108980_JonathanAndilinata.week04

class Employee (
    val name: String,
    val baseSalary: Int
){
    open fun work(){
        println("$name sedang bekerja")
    }

    open fun calculateBonus(): Int {
        val bonus = baseSalary * 0.10
        return bonus.toInt()
    }

}