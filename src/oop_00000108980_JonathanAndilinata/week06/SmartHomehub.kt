package oop_00000108980_JonathanAndilinata.week06

class SmartHomehub(){
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice){
        devices.add(device)
        println("device {${device.name}} added")
    }

    fun turnOffAllSwitches(){
        for(device in devices){
            when(device){
                is Switchable -> {
                    device.turnOff()
                }
            }
        }
    }

    fun activateSecurityMode(){
        for(device in devices){
            when(device){
                is Recordable -> {
                    device.startRecord()
                }
                is SmartSpeaker -> {
                    device.playMusic("Sirine Peringatan")
                }
            }
        }
    }

}