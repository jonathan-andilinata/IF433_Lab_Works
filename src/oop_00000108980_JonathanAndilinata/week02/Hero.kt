package oop_00000108980_JonathanAndilinata.week02

class Hero (
    val name: String,
    var HP: Int = 100,
    val baseDamage: Int
    )
{
    fun attack(targetName: String){
        println("$name attacking $targetName")
    }

    fun takeDamage(damage: Int){
        HP -= damage
        if (HP < 0){
            HP = 0
        }

    }

    fun isAlive(): Boolean {
            return HP > 0
    }
}