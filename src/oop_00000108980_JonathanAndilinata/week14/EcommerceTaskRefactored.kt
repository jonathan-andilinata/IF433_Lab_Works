package oop_00000108980_JonathanAndilinata.week14

import java.io.File
import java.io.FileWriter

interface OrderRepository{
    fun saveOrder(itemName: String, finalPrice: Double,customerType: String)
}

interface NotificationService{
    fun sendNotification(message: String)
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

class SafeOrderProcessor(val repo: OrderRepository, val notifier: NotificationService)
