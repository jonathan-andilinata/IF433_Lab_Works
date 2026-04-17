package oop_00000108980_JonathanAndilinata.week03

class Weapon(name: String, damage: Int, tier: String) {
    var serangan: Int = damage
        set(value) {
            if (value <= 0) {
                println("Damage di setting ke negatif! nilai ubah menjadi yang lama")
            } else if (value > 1000) {
                println("damage lebih dari 1000! di set ke 100")
                field = 1000
            } else {
                field = value
            }
        }
    var tiers: String = tier
        get(){
             if (serangan >= 800){
                return "legendary"
            } else if(serangan >= 500){
                return "epic"
            } else{
                return "common"
            }
        }
}
