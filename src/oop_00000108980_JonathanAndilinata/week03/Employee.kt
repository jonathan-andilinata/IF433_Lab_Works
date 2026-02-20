package oop_00000108980_JonathanAndilinata.week03

class Employee (val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("Error: Gaji tidak boleh negatif. Di-set ke 0")
                field = 0
            } else {
                field = value
            }
        }
    private var perfomanceRating: Int = 3

    fun incresePerformance(){
        perfomanceRating++
        println("Kinerja $name meningkat, Rating: $perfomanceRating")
    }

    fun printStatus(){
        println("Karyawan: $name, Rating: $perfomanceRating")
    }

    val tax: Double
        get() = salary * 0.1

}

