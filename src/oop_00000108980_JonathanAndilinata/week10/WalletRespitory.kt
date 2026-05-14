package oop_00000108980_JonathanAndilinata.week10

class WalletRespitory<T>() {
    private val items = mutableListOf<T>()

    fun add(item: T){
        items.add(item)
    }

    fun getAll(): List <T>{
        return items.toList()
    }
}