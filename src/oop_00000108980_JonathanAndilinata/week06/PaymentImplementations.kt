package oop_00000108980_JonathanAndilinata.week06

class Gopay: PaymentMethod {
    override fun pay(amount: Double){
        println("Processing Rp$amount via Gopay Server")
    }
}

class CreditCard: PaymentMethod{
    override fun pay(amount: Double){
        println("Contacting Bank for Rp$amount")
    }
}