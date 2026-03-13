package oop_00000108980_JonathanAndilinata.week06

class SmartHomehub(override val id: String, override val name: String): SmartDevice, Switchable{
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice){
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        for (device in devices) {
            when(device) {
                is Switchable -> device.turnOff()
            }
        }
    }

    fun activateSecurityMode(){
        for (device in devices){
            when(device){
                is Recordable ->{ device.startRecord() }
                is SmartSpeaker -> { device.playMusic("Sirine Peringatan")}
            }
        }
    }

    override fun turnOn(){
        println("$name dinyalakan")
    }

    override fun turnOff(){
        println("$name dimatikan")
    }
}