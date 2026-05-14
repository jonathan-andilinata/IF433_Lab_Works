package oop_00000108980_JonathanAndilinata.week10

interface nameable{
    val name: String
}

data class Coin(val name: String, val balance: Double)

data class Transaction(val id: String, val amount: Double)