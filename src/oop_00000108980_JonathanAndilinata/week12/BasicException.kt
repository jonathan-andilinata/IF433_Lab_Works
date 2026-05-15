package oop_00000108980_JonathanAndilinata.week12

fun divide (a: Int, b: Int): Int{
    try{
        return a / b
    } catch ( e: ArithmeticException){
        println("Error: ${e.message}")
        return -1
    } finally {
        println("Division attempt finished")
    }
}