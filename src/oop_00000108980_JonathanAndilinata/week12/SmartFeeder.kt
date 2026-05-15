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

fun main(){
    var currentKibbleStock = 50

    try{
        dispenseKibble(80,currentKibbleStock,false)
    } catch (e: DispenserJamException){
        println("${e.message}")
    } catch (e: FoodEmptyException){
        println("${e.message}")
    } catch (e: Exception) {
        println("${e.message}")
    } finally{
        println("Siklus pengecekan dispenser pagi selesai")
    }

}