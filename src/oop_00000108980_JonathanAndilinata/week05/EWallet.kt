package oop_00000108980_JonathanAndilinata.week05

class EWallet(accountName: String, var balance: Double): PaymentMethod(accountName){
    override fun processPayment(amount: Double) {
        if ( balance > amount){
            balance =- amount
        }
        else{
            println("saldo tidak cukup")
        }
    }

    fun topUp(amount: Double){
        balance += amount
    }
}