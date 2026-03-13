package oop_00000108980_JonathanAndilinata.week06

class SmartSpeaker(override val id : String, override val name : String): SmartDevice,Switchable{

    override fun turnOn(){
        println("Device Speaker dengan nama $name dengan id $id menyala")
    }

    override fun turnOff(){
        println("Device Speaker dengan nama $name dengan id $id mati")
    }

    fun playMusic(song: String){
        println("Memutar lagu $song dari Spotify")
    }

}