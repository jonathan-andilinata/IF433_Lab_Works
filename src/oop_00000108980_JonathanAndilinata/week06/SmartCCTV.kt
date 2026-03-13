package oop_00000108980_JonathanAndilinata.week06

class SmartCCTV(override val id: String, override val name: String): SmartDevice, Switchable, Recordable {
    override fun turnOn(){
        println("Device CCTV dengan nama $name dengan id $id menyala")
        startRecord()
    }

    override fun turnOff(){
        println("Device CCTV dengan nama $name dengan id $id mati")
    }

    override fun startRecord() {
        println("Device CCTV dengan nama $name dengan id $id mulai merekam")
    }

    override fun stopRecord() {
        println("Device CCTV dengan nama $name dengan id $id berhenti merekam")
    }


}