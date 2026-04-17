package oop_00000108980_JonathanAndilinata.week04

class electricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int): Car(brand, numberOfDoors){
   final override fun accelerate(){
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%")
    }
}