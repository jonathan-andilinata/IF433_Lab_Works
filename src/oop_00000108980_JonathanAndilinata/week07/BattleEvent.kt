package oop_00000108980_JonathanAndilinata.week07

sealed class BattleState{
    data class MonsterEncounter(val monsterName: String)
    data class LootDropped(val item: GameItem) : BattleState()
    data class GameOver(val reason: String): BattleState()
    object Safezone: BattleState()
}