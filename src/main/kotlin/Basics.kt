fun main() {
    // Data types
    val string: String = "String" // should be enclosed with double quotations
    val integer: Int = 2
    val double: Double = 5.0
    val float: Float = 1.0F // or 1f
    val char: Char = 'A' // should be enclosed with single quotations
    //    val wrongChar: Char = 'AB' // "A"
    val boolean: Boolean = true //or false
    val booleanWithOperation: Boolean = 1 > 2 //or false

    println(string)

    // Type cast
    // wrong
//    val typeCastDouble: Double = integer // error type mismatch
    // correct
    val typeCastDouble: Double = integer.toDouble()
    //String concatenation
    println("typeCastDouble: " + typeCastDouble) // concatenation can be converted to string template

    //String template expression
    //A template expression starts with a dollar sign ($) and can be a simple value
//    typeCastDouble = "typeCastDouble: $typeCastDouble"

    println(typeCastDouble)

    // Variables

    // 1. Declares a mutable variable and initializes it.
    // 2. Declares an immutable variable and initializes it.
    // 3. Declares an immutable variable and initializes it without specifying the type.
    //    The compiler infers the type Int.
    var a: String = "initial"  // 1
    a = "change"
    val b: Int = 1             // 2
//    b = 2 // Val cannot be reassigned
    val c = 3                  // 3

    println(a)
    println(b)
    println(c)

    // 1. Declares a variable without initialization.
    // 2. An attempt to use the variable causes a compiler error: Variable 'e' must be initialized.
    // You're free to choose when you initialize a variable, however, it must be initialized before the first read.
    var e: String // 1

//    println(e)  // 2

    //Null Safety
    //    e = null // error Null can not be a value of a non-null type String

    //Allow null-pointer exceptions using the !! operator
//    e!!.length

    //You can explicitly assign a variable to null using the safe call operator
//    var e: String? = null

//    You can test for null using the elvis (?:) operator
//    e?.length ?: 0

//    println(e.length)

    // Operators

    //Results of operations keep the types of the operands
    var sum = integer + integer
    val diff = 53 - 3
    val quotient = 50 / 10
    var product = 3.0 * 3.3
    val remainder = 9 % 3

//    sum = 2.0 // error type int
//    product = 2 // error type should be int

    println(sum)
    sum++
    println(sum)
    
}
