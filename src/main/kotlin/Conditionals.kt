fun main() {
    // repeat
    repeat(2) {
        println("Hello!")
    }

    // if/else statement
    val numberOfCups = 50
    var numberOfPlates: Int? = 30
    // java int numberOfPlates = (numberOfCups > 50) ? 50 : 30;
//    numberOfPlates = (numberOfCups > 50) ? 50 : 30
//    numberOfPlates = numberOfPlates ?: 50 //for nullable types
    if (numberOfCups > 50) {
        numberOfPlates = 50
    } else {
        numberOfPlates = 30
    }

    var message = "Hello!"
    if (numberOfCups > numberOfPlates) {
        message = "Too many cups!"
    } else if (numberOfCups == numberOfPlates) {
        message = "Cups is equal to plates!"
    } else {
        message = "Too many plates!"
    }
    println(message)

    //when statement
    val dataType: Any = "hello"

    when (dataType) {
        is Int -> println("Integer")
        is String -> println("String")
        is Double -> println("Double")
        is Float -> println("Float")
        is Char -> println("Char")
        is Boolean -> println("Boolean")
        else -> println("Unknown")
    }

    //for loop
    val pets = listOf("dog", "cat", "canary")
    for (pet in pets) {
        println("I have a $pet!")
    }

    val text = "Kotlin"
    for (letter in text) {
        println(letter)
    }

    //for loop - index and element
    for ((index, element) in pets.withIndex()) {
        println("Item at $index is $element")
    }

    //Range
    //for loop - step sizes and ranges
    for (i in 1..5) {
        print(i)
    }
    println()
    for (i in 5 downTo 1) {
        print(i)
    }
    println()
    for (i in 'd'..'g') {
        print(i)
    }
    println()
    for (i in 1 until 10) {  // i in 1 until 10, excluding 10
        print(i)
    }
    println()
    for (i in 0..pets.lastIndex) {
        println(pets[i])
    }
    pets.forEach {
        println(it)
    }

    //while loops
    println()
    var bicycles = 0
    while (bicycles < 5) {
        bicycles++
    }
    println("$bicycles bicycles in the rack")

    do {
        bicycles--
    } while (bicycles > 5)
    println("$bicycles bicycles in the rack")

    //Lambda
    val numOfPlates = { numOfCups: Int -> if (numOfCups > 50) 50 else 30 }
    println(numOfPlates(numberOfCups))

}

fun printHello() {
    repeat(2) {
        println("Hello!")
    }
}

fun checkCupsAndPlates(): Unit {
    val numberOfCups = 50
    val numberOfPlates = 30
    if (numberOfCups > numberOfPlates) {
        println("Too many cups!")
    } else if (numberOfCups == numberOfPlates) {
        println("Cups is equal to plates!")
    } else {
        println("Too many plates!")
    }
}

fun checkCupsAndPlates(numberOfCups: Int = 50, numberOfPlates: Int) {
    if (numberOfCups > numberOfPlates) {
        println("Too many cups!")
    } else if (numberOfCups == numberOfPlates) {
        println("Cups is equal to plates!")
    } else {
        println("Too many plates!")
    }
}

fun getCupsAndPlatesMessage(numberOfCups: Int = 50, numberOfPlates: Int = 30): String {
    if (numberOfCups > numberOfPlates) {
        return ("Too many cups!")
    } else if (numberOfCups == numberOfPlates) {
        return ("Cups is equal to plates!")
    } else {
        return ("Too many plates!")
    }
}

fun getNumberOfPlates(numberOfCups: Int = 50): Int =
    if (numberOfCups > 50) {
         50
    } else {
         30
    }
