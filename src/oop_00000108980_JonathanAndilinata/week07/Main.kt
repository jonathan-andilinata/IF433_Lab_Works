package oop_00000108980_JonathanAndilinata.week07

fun main (){

    println(ItemRarity.LEGENDARY.dropChance)
    val awal = Weapon.forgeStarterSword()
    val upgrade = awal.item.copy(damage = 25)
    GameManager.startgame()
    GameManager.startgame()
    
}