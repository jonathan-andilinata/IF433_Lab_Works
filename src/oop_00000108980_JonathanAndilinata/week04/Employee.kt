package oop_00000108980_JonathanAndilinata.week04

open class Employee(val name: String, val baseSalary: Int){
    open fun work(){
        println("$name is working")
    }

    open fun calculatedBonus(): Int {
        return baseSalary * 10/100
    }
}