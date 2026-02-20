package oop_00000108980_JonathanAndilinata.week03

fun main() {
    val player = Weapon("kapak", -50)
    val player2 = Weapon("gergaji", 9999)
    val player3 = Weapon("pedang",750)
    println("${player.damages},${player.tiers}")
    println("${player2.damages},${player2.tiers}")
    println("${player3.damages},${player3.tiers}")
}