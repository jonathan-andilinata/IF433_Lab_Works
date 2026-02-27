package oop_00000108980_JonathanAndilinata.week04

open class electricCar(Brand: String, numberOfDoors: Int, val batteryCapacity: Int): Car(Brand, numberOfDoors){
    final override fun accelerate(){
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%")
    }
}