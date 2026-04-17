package oop_00000108980_JonathanAndilinata.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("Judul Buku: ")
    val judul = scanner.nextLine()

    println("Judul Peminjam: ")
    val nama = scanner.next()

    println("lama minjam Buku: ")
    val durasi = scanner.nextInt()

    val peminjam = Loan(judul,nama,durasi)
    println("${peminjam.loanDuration}")
    peminjam.loan()

}