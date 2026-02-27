package oop_00000108980_JonathanAndilinata.week04

open class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary){
    override fun work(){
        println("$name sedang memimpin rapat divisi")
    }

    override fun calculateBonus(): Int{
        val bonus = super.calculateBonus()
        val total = bonus + 500000
        return total
    }
}