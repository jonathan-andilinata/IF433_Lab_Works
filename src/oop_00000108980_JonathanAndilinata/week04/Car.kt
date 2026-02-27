package oop_00000108980_JonathanAndilinata.week04

open class Car(brand: String, val numberOfDoors: Int): vehicle(brand){

    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka")
    }
}