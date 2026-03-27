package oop_00000108980_JonathanAndilinata.week07

fun main (){
    GameManager.startGame()
    GameManager.startGame()

    println("${ItemRarity.LEGENDARY.dropChance}")

    val pedang = Weapon.forgeStarterSword()
    println("Nama senjata: ${pedang.item.name}")
    println("Damage senjata: ${pedang.item.damage}")
    println("Rarity senjata: ${pedang.item.rarity}")
    println("Durability senjata: ${pedang.durability}")

    val pedangBaru = pedang.item.copy(damage = 25)
    println("pedangBaru: ${pedangBaru.damage}")

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin nakal"))
    processEvent(BattleState.LootDropped(pedangBaru))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))

}