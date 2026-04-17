package oop_00000108980_JonathanAndilinata.week03

fun main() {

    val hero = Weapon("ayam",100,"common")
    hero.serangan = -50
    println(hero.tiers)
    println(hero.serangan)
    hero.serangan = 9999
    println(hero.tiers)

    val asep = Player("Suctipo")
    asep.addXp(50)
    asep.addXp(60)
}