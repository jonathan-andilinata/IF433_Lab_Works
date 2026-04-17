package oop_00000108980_JonathanAndilinata.week06

interface SmartDevice{
     val id: Int
     val name: String
}

interface Switchable{
    fun turnOn()
    fun turnOff()
}

interface Recordable{
    fun startRecord()
    fun stopRecord(){
        println("Perekaman dihentikan dan disimpan ke Cloud")
    }
}