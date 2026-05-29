package oop_00000108980_JonathanAndilinata.week14

interface MultiFunctionDevice{
    fun print(doc: String)
    fun scan(doc: String)
    fun fax(doc: String)
}

class SimplePrinter : MultiFunctionDevice{
    override fun print(doc: String) = println ("Printing: $doc")
    override fun scan(doc: String) = throw UnsupportedOperationException("No scanner")
    override fun fax(doc: String) = throw UnsupportedOperationException("No fax")
}