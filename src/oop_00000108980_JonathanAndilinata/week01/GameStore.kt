package oop_00000108980_JonathanAndilinata.week01

fun main() {
    val gameTitle = "Ayams"
    val price = 10000

    printReceipt(gameTitle,price, CalculatedDiscount(price))

    val userNote: String? = null

    var Length = userNote?.length?: "tidak ada catatan"

    print(Length)

}

fun CalculatedDiscount (price : Int) : Int  = if (price > 50000) price * 2/10 else price * 1/10

fun printReceipt( title: String, FinalPrice: Int, discount: Int){
   println("Judul: $title,  Final Price: $FinalPrice, Setelah diskon: $discount")
}