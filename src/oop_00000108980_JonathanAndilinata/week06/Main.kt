package oop_00000108980_JonathanAndilinata.week06


fun main(){
    val lampu = SmartLamp("1","Ruang Tamu")
    val speaker = SmartSpeaker("2","Google Nest Dapur")
    val CCTV = SmartCCTV("3","Ezviz Garasi")

    val hub = SmartHomehub("1","rumah")
    hub.addDevice(lampu)
    hub.addDevice(speaker)
    hub.addDevice(CCTV)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}