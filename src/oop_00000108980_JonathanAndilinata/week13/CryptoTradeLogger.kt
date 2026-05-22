package oop_00000108980_JonathanAndilinata.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    val parts = line.split(",")
    return try {
        TradeRecord(parts[0].toInt(), parts[1], parts[2], parts[3].toDouble(), parts[4].toDouble())
    } catch (e: Exception) {
        println("(log) Data korup diabaikan $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>,path: String){
   File(path).printWriter().use{ writer ->
        for (trade in trades) {
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List <TradeRecord>{
    return try{
        File(path).readLines().mapNotNull{ fromCsvTrade(it) }
    } catch (e: FileNotFoundException){
        emptyList()
    }
}

fun main(){
    val trade = listOf(
        TradeRecord(1, "BTCUSDT", "LONG", 50.0, 12.5),
        TradeRecord(2, "ETHUSDT", "SHORT", 100.0, -25.0),
        TradeRecord(3, "SOLUSDT", "LONG", 30.0, 8.4)
    )
    saveTrades(trade,"crypto_trades.csv")
    File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")
    val loadedData = loadTrades("crypto_trades.csv")
    val totalPnl = loadedData.sumOf{it.pnl}

    println("==== TOTAL Pnl BERSIH: $totalPnl ===")
}