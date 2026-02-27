package oop_00000108980_JonathanAndilinata.week03

class Player (
    val username: String,
    private var xp: Int = 0,
    )
{
    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int){
        val oldlevel = level
        xp += amount
        val newlevel = level

        if (newlevel > oldlevel){
            println("Level up! Selamat $username naik ke level $level!")
        }
    }
}