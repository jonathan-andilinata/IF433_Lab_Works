package oop_00000108980_JonathanAndilinata.week12

fun dispenseKibble(requestedGram: Int, avaiableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0){
        "Porsi kibble harus lebih dari 0 gr"
    }
    if (isJammed) {
        throw DispenserJamException()
    }
    if (requestedGram > avaiableGram){
       throw FoodEmptyException(requestedGram, avaiableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return avaiableGram - requestedGram
}