package org.example.dam.exer_2

var num1: Double = 0.0
var num2: Double = 0.0

/*
    Create a console-based calculator that allows users to perform various operations.
        Mandatory:
            - The when expression for handling different operations.
            - Exceptions to handle potential errors (e.g., division by zero, invalid input).
            - String templates and string formatting for a clear and structured output.
 */

fun main() {

    println("---------------------------------")
    println("|   Kotlin Console Calculator   |")
    println("---------------------------------")

    while (true) {

        try {

            println(
                """
                    
                Choose an operation:
                1 -> Addition (+)
                2 -> Subtraction (-)
                3 -> Multiplication (*)
                4 -> Division (/)
                5 -> Boolean AND (&&)
                6 -> Boolean OR (||)
                7 -> Boolean NOT (!)
                8 -> Left Shift (shl)
                9 -> Right Shift (shr)
                0 -> Exit
                """.trimIndent()
            )

            print("Enter an operation: ")
            val choice = readln().toIntOrNull()
                ?: throw IllegalArgumentException("Invalid choice!")

            if (choice == 0) {
                println("Exiting calculator.")
                break
            }

            when (choice) {

                1 -> {
                    println("Addition (+)")
                    askNumbers()
                    val result = num1 + num2
                    displayNumericResult(result)
                }

                2 -> {
                    println("Subtraction (-)")
                    askNumbers()
                    val result = num1 - num2
                    displayNumericResult(result)
                }

                3 -> {
                    println("Multiplication (*)")
                    askNumbers()
                    val result = num1 * num2
                    displayNumericResult(result)
                }

                4 -> {
                    println("Division (/)")
                    askNumbers()
                    if (num2 == 0.0) throw IllegalArgumentException("Error: division by zero!")
                    val result = num1 / num2
                    displayNumericResult(result)
                }

                5 -> {
                    println("Boolean AND (&&)")
                }

                6 -> {
                    println("Boolean OR (||)")
                }

                7 -> {
                    println("Boolean NOT (!)")
                }

                8 -> {
                    println("Left Shift (shl)")
                }

                9 -> {
                    println("Right Shift (shr)")
                }

                else -> { println("Invalid choice!") }

            }

        }

        catch (e: Exception) { println("Error: ${e.message}") }

    }

}

fun askNumbers() {
    print("Enter first number: ")
    num1 = readln().toDoubleOrNull()
        ?: throw NumberFormatException("Invalid first number!")

    print("Enter second number: ")
    num2 = readln().toDoubleOrNull()
        ?: throw NumberFormatException("Invalid second number!")

}

fun displayNumericResult(result: Double) {
    println("\nResult:")
    println("Decimal     : ${"%.4f".format(result)}")
    println("Hexadecimal : 0x${result.toLong().toString(16)}")
    println("Boolean     : ${result != 0.0}")
    println(" ")
    println(" ---------- ")
}