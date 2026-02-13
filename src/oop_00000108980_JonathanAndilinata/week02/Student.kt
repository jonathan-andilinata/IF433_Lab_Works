package oop_00000108980_JonathanAndilinata.week02

class Student(
    val name: String,
    val nim: String,
    val major: String
) {
    init {
        if (nim.length != 5) {
            println("Warning: Objek tercipta dengan NIM ($nim) yang tidak valid")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem")
        } else {
            println("Log: Objek student $name berhasil dialokasikan ke memory")
        }
    }
}