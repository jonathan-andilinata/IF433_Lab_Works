package oop_00000108980_JonathanAndilinata.week01

fun main() {
    val gameTitle = "Ayams"
    val price = 10000

    printReceipt(gameTitle,price)
}

fun CalculatedDiscount (price : Int)  = if (price > 50000) price * 0.20 else price * 0.10

fun printReceipt( title: String, FinalPrice: Int){
   println("$title, $FinalPrice")
}