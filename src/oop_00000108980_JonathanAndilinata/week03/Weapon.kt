package oop_00000108980_JonathanAndilinata.week03

class Weapon (
   val name: String,
   var damage: Int = 100,
   val tier: String = "Common"
) {
    var damages: Int = damage
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

    val tiers: String
        get() = when {
            damages > 800 -> "Legendary"
            damages > 500 -> "Epic"
            else -> "Common"
        }


    init {
        damages = damage
      }
}