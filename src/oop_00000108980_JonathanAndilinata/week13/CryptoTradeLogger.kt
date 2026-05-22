package oop_00000108980_JonathanAndilinata.week13

import java.io.File

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
   val write = File(path).printWriter().use{ writer ->
        for (trade in trades) {
            writer.println(trade.toCsv())
        }
    }
}