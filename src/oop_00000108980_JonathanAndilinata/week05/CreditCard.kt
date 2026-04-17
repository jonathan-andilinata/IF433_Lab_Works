package oop_00000108980_JonathanAndilinata.week05

class CreditCard(accountName: String, val limit: Double,var usedAmount: Double ):PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Sukses, amount bertambah $usedAmount")
        } else {
            println("Gagal")
        }
    }
}