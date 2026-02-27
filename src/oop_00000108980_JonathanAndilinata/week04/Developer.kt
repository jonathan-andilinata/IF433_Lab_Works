package oop_00000108980_JonathanAndilinata.week04

class Developer(name: String, baseSalary: Int,val progammingLanguage: String): Employee(name,baseSalary){
     override fun work(){
         println("$name sedang ngoding menggunakan $progammingLanguage")
     }

    override fun calculateBonus(): Int {
        return super.calculateBonus()
    }
}