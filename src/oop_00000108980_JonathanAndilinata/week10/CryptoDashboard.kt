package oop_00000108980_JonathanAndilinata.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC",1.0))
    coinRepo.add(Coin("ETH",0.8))
    coinRepo.add(Coin("USDT",0.54))

    val response = ApiResponse("200 OK",coinRepo.getAll())

    response.data.forEach { coin ->
        println("name: ${coin.name}, balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("BTC",1.0))

}