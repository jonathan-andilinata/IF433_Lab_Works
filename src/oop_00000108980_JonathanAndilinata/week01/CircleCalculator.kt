package oop_00000108980_JonathanAndilinata.week01

fun main (array: Array<String>){
    var radius: Double = 7.0
    var pi: Double = 3.14

    var area: Double = pi * radius * radius

    println("Radius: " + radius + ",Area: " + area)

    checkSize(area)

}

fun checkSize(area: Double){
    if ( area > 100){
        println("This is a big Circle")
    }
    else{
        println("This is a small circle")
    }
}