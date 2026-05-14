package oop_00000108980_JonathanAndilinata.week10

fun main(){
    val coinRepo = WalletRespitory<Coin>()
    coinRepo.add(Coin("BTC",1.0))
    coinRepo.add(Coin("ETH",0.8))
    coinRepo.add(Coin("USDT",0.54))
}