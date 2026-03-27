package oop_00000108980_JonathanAndilinata.week07

class GameExecutor {
}

fun processEvent(event: BattleState){
    when(event){
        is BattleState.MonsterEncounter -> {
            println("Monster bernama ${event.monsterName} muncul!")
        }
        is BattleState.LootDropped -> {
            println("kamu mendapatkan loot ${event.item} ")
        }
        is BattleState.GameOver -> {
            println("${event.reason}")
        }
        is BattleState.SafeZone -> {
            println("kamu berada di safe zone")
        }
    }
}