package oop_00000108980_JonathanAndilinata.week06

class SmartCCTV(override val id: Int, override val name: String): SmartDevice, Switchable, Recordable{
    override fun turnOn(){
        println("Device $id dengan nama $name menyala")
        startRecord()
    }

    override fun turnOff(){
        println("Device $id dengan nama $name mati")
    }

    override fun startRecord() {
        println("Device $id dengan nama $name sedang record aktivitas")
    }

    override fun stopRecord(){
        println("Device $id dengan nama $name berhenti record aktivitas")
    }
}