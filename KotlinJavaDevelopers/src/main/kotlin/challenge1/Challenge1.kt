package challenge1

fun main(args: Array<String>) {

    // Declare two immutable String variables called hello1 and hello2. Assign "Hello"
    // to both variables.

    val hello1 = "Hello"
    val hello2 = "Hello"

    // Using one line of code, test whether hello1 and hello2 are referentially equal
    // and print the result
    println(hello1 === hello2)

    // Using one line of code, test whether hello1 and hello2 are structurally equal
    // and print the result.
    println(hello1 == hello2)

    // Declare a mutable variable of type Int and assign it the value 2988.
    var myvar = 2988

    // Declare an immutable variable of type Any and assign to it the string "The Any type
    // is the root of the Kotlin class hierarchy". Then, using a smart cast, print out
    // the uppercased string.
    val myany:Any = "The Any type is the root of the Kotlin class hierarchy"

    if (myany is String)
        println(myany.toUpperCase())

    // Using one line of code, print out the following. Make sure your code is
    // nicely indented:
    //    1
    //   11
    //  111
    // 1111
    println("""
    //    1
    //   11
    //  111
    // 1111""".trimMargin("//"))


}