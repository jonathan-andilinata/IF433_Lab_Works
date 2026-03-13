package oop_00000108980_JonathanAndilinata.week06

class SmartLamp(override val id: String, override val name:String): SmartDevice, Switchable {

    override fun turnOn() {
        println("Device lampu dengan nama $name dengan id $id menyala")
    }

    override fun turnOff(){
        println("Device lampu dengan nama $name dengan id $id Mati")
    }
}