package oop_00000108980_JonathanAndilinata.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println(" --- Aplikasi PMB UMN ---")

    print("masukkan nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("Error: Pendaftaran dibatalkan. NIM harus 5 karakter")
    }
    else{
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran selesai")
    }
}