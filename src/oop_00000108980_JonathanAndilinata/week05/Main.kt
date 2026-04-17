package oop_00000108980_JonathanAndilinata.week05

import oop_00000108980_JonathanAndilinata.week07.processEvent

fun main() {
    val ovo = EWallet("Jonathan",50000.00)
    val bca = CreditCard("Jonathan",10000.00,0.00)

   val listMoney: List<PaymentMethod> = listOf(ovo,bca)

    for(PaymentMethod in listMoney){
        when(PaymentMethod){
            is EWallet -> {
                PaymentMethod.topUp(50000.00)
                PaymentMethod.processPayment(75000.00)
            }
        }
    }
}