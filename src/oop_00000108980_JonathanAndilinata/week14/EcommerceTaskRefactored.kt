package oop_00000108980_JonathanAndilinata.week14

import java.io.File
import java.io.FileWriter

interface OrderRepository{
    fun saveOrder(itemName: String, finalPrice: Double,customerType: String)
}

interface NotificationService{
    fun sendNotification(message: String)
}

interface PricingStrategy{
    fun calculate(price: Double): Double
}

class CsvOrderRepository( private val filePath: String = ("Orders.csv")) : OrderRepository{
    override fun saveOrder(itemName: String, finalPrice: Double,customerType: String){
           val file = File(filePath)

           FileWriter(file,true).use { writer ->
               writer.write("$itemName,$finalPrice,$customerType\n")
           }
    }
}

class EmailNotifier: NotificationService{
    override fun sendNotification(message: String){
        println("Email terkirim: $message")
    }
}

class VipPricing: PricingStrategy{
    override fun calculate(price: Double): Double{
        return price * 0.9
    }

}

class RegularPricing: PricingStrategy {
    override fun calculate(price: Double): Double {
        return price
    }
}

class SafeOrderProcessor(val repo: OrderRepository, val notifier: NotificationService){
    fun processOrder(itemName: String, itemPrice: Double,customerType: String,pricingStrategy: PricingStrategy){
        val finalPrice: Double = pricingStrategy.calculate(itemPrice)

        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(itemName,finalPrice,customerType)
        notifier.sendNotification("Order $itemName, $itemPrice")
    }
}


