package oop_00000108980_JonathanAndilinata.week08

class ApiParser{
    fun parseProduct( rawJson: Map <String, Any?>): Product?{
        val Id = requireNotNull(rawJson["id"]){"API Invalid: ID missing"}
        val Name = requireNotNull(rawJson["name"]){"API Invalid: Name missing"}

        val type = rawJson["type"] as? String

       return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int?: 12
                Product.Electronic(Id.toString(), Name.toString(), warranty )
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String?: "All Size"
                Product.Clothing(Id.toString(), Name.toString(), size)
            }
            else -> null
        }
    }

    fun checkout(product: Product){
       val id = when (product) {
           is Product.Electronic -> product.id
           is Product.Clothing -> product.id
       }
        val transactionID = JavaPaymentService.processPayment(id)!!

        val details = when (product) {
            is Product.Electronic -> "(Warranty ${product.warrantyMonths})"
            is Product.Clothing -> "(Size ${product.size})"
        }
        println("Transaction ID: $transactionID, $details")
    }
}