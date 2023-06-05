import java.util.*

fun main() {
    //Immutable list
    val instruments = listOf("trumpet", "piano", "violin")
    println(instruments)

//    instruments = listOf()
//    instruments.add("guitar")
    println(instruments)

    //Mutable list
    val myInstruments = mutableListOf("trumpet", "piano", "violin")
    println(myInstruments)

    myInstruments.remove("violin")
    println(myInstruments)

    myInstruments.add("guitar")
    println(myInstruments)

    //Array
    val pets = arrayOf("dog", "cat", "bird")
    println(pets)
    println(pets.contentToString())
    println(pets[0])

    //Mixed type array
    val mix = arrayOf("hat", 2)
    println(pets.contentToString())
    //Single type
//    val number = intArrayOf(1, 2 , 3 ,"") type mismatch
    val number = intArrayOf(1, 2, 3)
    val number2 = intArrayOf(4, 5, 6)
    println(pets.contentToString())
    //Combining arrays
    val combine = number + number2
    println(combine.contentToString())

    //Filter
    val books = listOf("nature", "biology", "birds")
    println(books.filter { it[0] == 'b' })
    println(books.filter { it[0] == 'n' })

    //First
    println("First:")
    println(books.first())
    println(books.first { it[0] == 'b' })

    //Last
    println("Last:")
    println(books.last())
    println(books.last { it[0] == 'b' })

    //Map
    val numbers = setOf(1, 2, 3)
    println(numbers.map { it * 3 })

    //Flatten
    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5), setOf(6, 7, 8))
    println(numberSets.flatten())

    //Any
    println(books.any { it[0] == 'b' })
    println(books.any { it[0] == 'a' })


}