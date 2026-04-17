package oop_00000108980_JonathanAndilinata.week03

class Player(val username: String){
    private var xp: Int = 0

    var level: Int = 0
        get() = (xp / 100) + 1

    fun addXp(amount: Int){
        if ( amount < 0){
            println("error, only accept positive")
        }
        else{
            xp += amount
            if (xp >= level){
                level++
                println("Player $username level up ke $level")
            }
        }
    }
}

