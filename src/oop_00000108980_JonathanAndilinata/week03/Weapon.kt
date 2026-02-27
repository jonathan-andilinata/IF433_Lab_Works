package oop_00000108980_JonathanAndilinata.week03

class Weapon (
   val name: String,
    var damages: Int
) {
    var damage: Int = damages
        set(value){
          if (damages < 0){
              println("Damage Weapom di set negatif, akan ada masalah nanti!")
              field = 100
          }
          else if (damages > 1000){
              println("Damage tidak boleh lebih dari 1000, di set ke 1000")
              field = 1000
          }
        }
    init{
        damage = damages
    }

    val tiers: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"

      }
}