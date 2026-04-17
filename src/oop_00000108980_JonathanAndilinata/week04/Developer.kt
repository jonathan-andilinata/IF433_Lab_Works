package oop_00000108980_JonathanAndilinata.week04

class Developer(name: String, baseSalary: Int, val progammingLanguange: String): Employee(name, baseSalary){
    override fun work(){
        println("$name sedang ngoding menggunakan $progammingLanguange")
    }

    override fun calculatedBonus(): Int {
        return super.calculatedBonus()
    }
}