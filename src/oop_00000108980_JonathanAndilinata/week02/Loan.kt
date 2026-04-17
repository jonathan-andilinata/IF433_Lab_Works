package oop_00000108980_JonathanAndilinata.week02

class Loan(val bookTitle: String, val borrower: String, val loanDuration: Int = 1) {

    fun calculateFine(): Int {
        if (loanDuration > 3) {
           return (loanDuration - 3) * 2000
        } else {
            return 0
        }
    }
    fun loan(){
        val fine = calculateFine()
        println("lama peminjaman $loanDuration dan total denda $fine")
    }
}



