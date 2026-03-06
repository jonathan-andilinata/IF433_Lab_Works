package oop_00000108980_JonathanAndilinata.week05

class CreditCard(AccountName: String, var balance: Double, val limit: Double, var usedAmount: Double = 0.0): PaymentMethod(AccountName) {
    override fun processPayment(amount:Double){
        if (usedAmount + amount <= limit){
            usedAmount += amount
            println(" Transaksi Sukses")
        }
        else{
            print("Transaksi ditolak")
        }
    }
}