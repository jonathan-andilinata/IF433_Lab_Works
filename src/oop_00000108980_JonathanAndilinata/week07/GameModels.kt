package oop_00000108980_JonathanAndilinata.week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(100),
    UNCOMMON(80),
    RARE(50),
    EPIC(30),
    LEGENDARY(10)
}

data class GameItem(val name: String, val damage: Int, val rarity: ItemRarity)



