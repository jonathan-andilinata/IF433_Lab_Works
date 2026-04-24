package oop_00000108980_JonathanAndilinata.week09

fun main(){
    println("=== TEST LIST ===")

    val framework: List<String> = listOf("Kotlin","Java","C++")

    println("Immutable List: $framework")

    val scores: MutableList<Int> = mutableListOf(85,90)
    scores.add(95)
    scores[0] = 88
    println("Mutable list: $scores")

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1,2,2,3,3,4)

    println("Unique Numbers (set): $uniqueNumbers")

    val activeUsers = mutableSetOf("UserA","UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA")
    println("Activate Users: $activeUsers")

    println("\n=== TEST MAP ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A"
    )
    println("Nilai Bob: ${studentGrades["Bob"]}")

    val inventory = mutableMapOf("Apples" to 50, "bananas" to 30)
    inventory["oranges"] = 20
    inventory["Apples"] = 45
    println("Inventory: $inventory")
}