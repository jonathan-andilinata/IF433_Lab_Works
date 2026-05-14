package oop_00000108980_JonathanAndilinata.week10

class WalletRepository<T : Any>() {
    private val items = mutableListOf<T>()

    fun add(item: T){
        items.add(item)
    }

    fun getAll(): List <T>{
        return items.toList()
    }

    fun search(names: String): List <T>{
        return items.filter { item ->
            if (item is nameable) {
                item.name.contains(names, ignoreCase = true)
            } else{
                item.toString().contains(names, ignoreCase = true)
            }
        }
    }
}