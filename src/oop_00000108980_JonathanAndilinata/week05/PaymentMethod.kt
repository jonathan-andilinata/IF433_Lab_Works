package oop_00000108980_JonathanAndilinata.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}