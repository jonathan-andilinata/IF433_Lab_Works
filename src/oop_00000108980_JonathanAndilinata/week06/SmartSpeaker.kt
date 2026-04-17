package oop_00000108980_JonathanAndilinata.week06

class SmartSpeaker(override val id: Int, override val name: String): SmartDevice, Switchable{
    override fun turnOn(){
        println("Device $id dengan nama $name menyala")
    }

    override fun turnOff(){
        println("Device $id dengan nama $name mati")
    }

    fun playMusic(song: String){
        println("Memutar lagu $song dari spotify")
    }
}