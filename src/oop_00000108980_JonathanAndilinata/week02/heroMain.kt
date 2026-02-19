package oop_00000108980_JonathanAndilinata.week02

import java.util.Scanner

import java.util.Random

fun main(){
    val scanner = Scanner (System.`in`)

    println("Input nama Hero: ")
    val name = scanner.nextLine()

    println("Input Stat Damage: ")
    val damage = scanner.nextInt()

    val player = Hero(name = name, baseDamage = damage)

    var enemyHp = 100

    while(player.isAlive() && enemyHp > 0) {

        println("1. Serang, 2. Kabur: ")
        when (scanner.nextInt()) {
            1 -> {
                player.attack("anomaly")
                enemyHp -= player.baseDamage

                if (enemyHp > 0) {
                    val takeDamage = (10..20).random()
                    player.takeDamage(takeDamage)
                    println("HP Left:${player.HP}")
                }
            }
            2 -> {
                println("You Escape")
                return
            }
            else -> {
                println("Wrong Choice")
            }
        }

        if (enemyHp <= 0){
            println("You win")
        }
        else if (!player.isAlive()){
            println("You lose")
        }

    }
}



