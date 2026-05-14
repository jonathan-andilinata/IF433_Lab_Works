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

    val acInverter = run {
        val Device = SmartDevice("Daikin Inverter(Kabel 3x2.5)", "HVAC", false, 800)
        Device
    }
    homeDevices.add(acInverter)

    homeDevices.add(SmartDevice("Picolo's Auto Feeder","Pet Care",true,10))

    val searchResult = homeDevices.find{
        it.category == "Camera"
    }?.let{
        val result = it.diagnose()
        print(result)
    }
    with(homeDevices){
        println("\nTotal Size: ${this.size}")
    }

    val totalPower = homeDevices.run{
        sumOf {  it.powerLoad }
        println("Total Power: ${sumOf { it.powerLoad }}")
    }

}