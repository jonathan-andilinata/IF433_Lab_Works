package oop_00000108980_JonathanAndilinata.week05

fun main() {
    val orang = EWallet("ayam",50.000)
    val manusia = CreditCard("sapi",100000.0,100000.0)

    val daftarOrang: List<PaymentMethod> = listOf(orang,manusia)

    for (method in daftarOrang){
        method.processPayment(75000.0)
    }

}