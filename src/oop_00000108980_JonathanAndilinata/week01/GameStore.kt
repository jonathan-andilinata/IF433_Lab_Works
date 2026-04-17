package oop_00000108980_JonathanAndilinata.week01

fun main(){
val gameTitle = "Ayams"
val price = 10000
    val userNote: String? = null

val discount = CalculatedDiscount(price)

printReceipt(gameTitle, discount, userNote)

val Length = userNote?.length?: "tidak ada catatan"

print(Length)

}

fun CalculatedDiscount (price : Int) : Int{
    if (price > 50000) {
        return price * 2/10
    }
    else {
       return price * 1/10
    }
}

fun printReceipt(title: String, FinalPrice: Int, note: String? = null) {
    println("$title, $FinalPrice")
    val nota = note ?: "tidak ada catatan"
}