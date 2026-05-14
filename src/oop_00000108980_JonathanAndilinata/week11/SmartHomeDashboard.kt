package oop_00000108980_JonathanAndilinata.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    val lampu = SmartDevice("lamp","cahaya").apply {
        name = "Philips WiZ Living Room"
        category = "Lightning"
        isOnline = true
        powerLoad = 12
    }.also{
        homeDevices.add(it)
        println("${it.name} berhasil ditambahkan")
    }

    SmartDevice("Ezviz Outdoor","Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also{
        homeDevices.add(it)
        println("(LOG) Kamera Terhubung")
    }

}