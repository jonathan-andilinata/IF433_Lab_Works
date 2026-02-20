package oop_00000108980_JonathanAndilinata.week03

fun main() {
    val player = Weapon("kapak",-50)
    val player2 = Weapon("gergaji",9999)
    val player3 = Weapon("pedang",750)
    println("${player.damage},${player.tiers}")
    println("${player2.damage},${player2.tiers}")
    println("${player3.damage},${player3.tiers}")

    val person = Player("John",50)
    person.xp
    person.addXp(50)
    person.addXp(60)

}