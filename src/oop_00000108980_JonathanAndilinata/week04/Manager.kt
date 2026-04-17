package oop_00000108980_JonathanAndilinata.week04

class Manager(name: String, baseSalary: Int): Employee(name, baseSalary){
    override fun work(){
        println("$name sedang memimpin rapat divisi")
    }

    override fun calculatedBonus(): Int {
        return super.calculatedBonus() + 500000
    }
}