package oop_00000108980_JonathanAndilinata.week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame(){
        if(isGameRunning){
            println("Memulai Game Engine...")
        }
        else{
            isGameRunning = true
            println("Game sudah berjalan! Mencegah instansiasi ganda")
        }

    }

}