package oop_00000108980_JonathanAndilinata.week07

fun processEvent(event: BattleState.MonsterEncounter){
    val message = when(event){
        is BattleState.MonsterEncounter -> "Monster datang"
        is BattleState.GameOver -> "game Over"
        is BattleState.LootDropped -> "Loot dropped"
        is BattleState.Safezone -> "safe"
    }
}