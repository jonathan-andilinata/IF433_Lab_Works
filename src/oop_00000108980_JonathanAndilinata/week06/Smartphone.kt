package oop_00000108980_JonathanAndilinata.week06

class Smartphone: Camera, Phone {

    override fun turnOn(){
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem Operasi Smartphone berhasil booting")
    }
}