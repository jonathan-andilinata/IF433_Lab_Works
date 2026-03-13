package oop_00000108980_JonathanAndilinata.week06

class Button (override val name: String): Clickable {
    override fun click(){
        println("Tombol '$name' berhasil di klik")
    }
}