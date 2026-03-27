package oop_00000108980_JonathanAndilinata.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object{
        fun forgeStarterSword(): Weapon{
            val pedang = GameItem("Pedang Kayu Bapuk",5, ItemRarity.COMMON)
            return Weapon(pedang,50)

        }

        fun forgeEpicSword(): Weapon{
            val pedang = GameItem("Pedang Kayu Cahaya",25, ItemRarity.EPIC)
            return Weapon(pedang,200)
        }
    }
}