package oop_00000108980_JonathanAndilinata.week07

fun main (){

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan Alert: ${response.message}"
        is ApiResponse.Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)
}