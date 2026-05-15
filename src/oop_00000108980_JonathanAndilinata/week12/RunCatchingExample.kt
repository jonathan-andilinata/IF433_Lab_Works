package oop_00000108980_JonathanAndilinata.week12

fun main(){
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
    val safeValue = result.getOrElse{-1}
    println("Safe Value (getOrElse): $safeValue")

    runCatching {
        "100".toInt()
    }.onSuccess { v ->
        println("Berhasil dikonversi: $v")
    }.onFailure { e ->
        println("Gagal konversi: ${e.message}")
    }
}
