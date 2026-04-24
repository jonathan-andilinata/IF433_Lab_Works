package oop_00000108980_JonathanAndilinata.week09

fun main(){
    val tradeHistory = listOf(
        Tradelog("BTC/USDT", "LONG", 20, 15.5, "CLOSED"),
        Tradelog("ETH/USDT", "SHORT", 10, -5.2, "CLOSED"),
        Tradelog("SOL/USDT", "LONG", 5, 42.0, "CLOSED"),
        Tradelog("BNB/USDT", "SHORT", 25, 8.7, "OPEN"),
        Tradelog("DOT/USDT", "LONG", 3, -2.1, "OPEN"),
        Tradelog("LINK/USDT", "SHORT", 15, 12.3, "CLOSED")
    )
    val closedTrades = tradeHistory.filter{it.status == "CLOSED"}
    val winningTrades = closedTrades.filter{it.roe > 0}
    val losingTrades = closedTrades.filter{it.roe <= 0}

    val topPerformerString = winningTrades.sortedByDescending { it.roe }.map{"WIN [BTCUSDT - LONG]: +15.5% ROE (Lev: 20x)"}
    val worstPerformersString = losingTrades.sortedBy { it.roe }.map{"LOSS [ETHUSDT - SHORT]: -5.2% ROE (Lev: 10x)"}

    val uniquePairs = tradeHistory.map{it.pair}.toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")

    worstPerformersString.forEach{loss ->
        println(loss)
    }
    println("Unique pairs: $uniquePairs")

}