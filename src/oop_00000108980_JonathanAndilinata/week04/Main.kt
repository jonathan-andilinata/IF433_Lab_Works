package oop_00000108980_JonathanAndilinata.week04

fun main(){
    println("---Vehicle Testing---")
    val generateVehicle = vehicle("lambogino")
    generateVehicle.honk()
    generateVehicle.accelerate()

    println("\n---Car Testing---")
    val myCar = Car("koegnisegg", 2)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    val electric = electricCar("BYD Seal",2,77)
    electric.accelerate()
    electric.honk()
    electric.openTrunk()
}