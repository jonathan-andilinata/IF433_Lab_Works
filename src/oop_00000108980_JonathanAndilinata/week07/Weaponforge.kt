package oop_00000108980_JonathanAndilinata.week07

class Weapon private constructor(val item: GameItem, val durability: Int){
    companion object{
        fun forgeStarterSword(): Weapon {
            val kayu= GameItem("Pedang Kayu Bapuk",5,ItemRarity.COMMON)

            val durability = 5
            println("Membuat ${kayu.name} dengan damage ${kayu.damage} dan rarity ${kayu.rarity} dengan durability $durability")
            return Weapon(kayu, durability)
        }

        fun forgeEpicSword(): Weapon{
            val durability = 50
            val epic = GameItem("Pedang Kayu Bersinar",40, ItemRarity.EPIC)
            return Weapon(epic,durability)
        }
    }
}