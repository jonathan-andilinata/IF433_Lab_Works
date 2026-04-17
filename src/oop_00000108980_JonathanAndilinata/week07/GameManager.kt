package oop_00000108980_JonathanAndilinata.week07

object GameManager {
    var isGameRunning = false

    fun startgame(){
        if (!isGameRunning){
            isGameRunning = true
            println("Memulai game engine")
        }
        else{
            println("Game sudah berjalan!")
        }
    }
}