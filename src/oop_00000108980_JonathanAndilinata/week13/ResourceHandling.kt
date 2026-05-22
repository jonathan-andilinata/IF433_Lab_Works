package oop_00000108980_JonathanAndilinata.week13

import java.io.File

fun main(){
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("Unsafe_logs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka Koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")

    writer.close()

    println("Proses penulisan unsafe selesai")

}