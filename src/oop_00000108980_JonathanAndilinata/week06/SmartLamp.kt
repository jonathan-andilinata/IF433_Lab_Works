package oop_00000108980_JonathanAndilinata.week06

class SmartLamp(override val id: Int, override val name: String): SmartDevice,Switchable{
    override fun turnOn(){
        println("Device $id dengan nama $name menyala")
    }
    override fun turnOff(){
        println("Device $id dengan nama $name mati")
    }
}