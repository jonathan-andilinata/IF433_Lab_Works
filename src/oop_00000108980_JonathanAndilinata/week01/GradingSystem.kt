package oop_00000108980_JonathanAndilinata.week01

fun main (){
    var name = "Jonathan"
    var score = 80

    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
        println("Grade kamu: $grade")

    println ("Status: ${calculateStatus(score)}")

    val studentId : String? = null

    val idLenght = studentId?.length ?: 0

    println("Panjang ID: $idLenght")

}

fun calculateStatus(score: Int) = if (score > 75) "lulus" else "Tidak lulus"