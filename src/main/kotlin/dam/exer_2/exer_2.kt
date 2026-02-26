package org.example.dam.exer_2

/*
    Create a console-based calculator that allows users to perform various operations.

        Mandatory:
            - The when expression for handling different operations.
            - Exceptions to handle potential errors (e.g., division by zero, invalid input).
            - String templates and string formatting for a clear and structured output.

        Calculator should support the following:
            - Basic arithmetic operations: Addition, subtraction, multiplication, and division.
            - Boolean operators: AND (&&), OR (||), NOT (!).
            - Bitwise shift operators: Left shift (shl), right shift (shr).
            - Show the results in decimal, hexadecimal, and boolean.
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
                    val (num1, num2) = askNumbers()
                    val result = num1 + num2
                    displayResult(result)
                }

                2 -> {
                    println("Subtraction (-)")
                    val (num1, num2) = askNumbers()
                    val result = num1 - num2
                    displayResult(result)
                }

                3 -> {
                    println("Multiplication (*)")
                    val (num1, num2) = askNumbers()
                    val result = num1 * num2
                    displayResult(result)
                }

                4 -> {
                    println("Division (/)")
                    val (num1, num2) = askNumbers()
                    if (num2 == 0.0) throw IllegalArgumentException("Error: division by zero!")
                    val result = num1 / num2
                    displayResult(result)
                }

                5 -> {
                    println("Boolean AND (&&)")
                    val (bool1, bool2) = askBooleans()
                    val result = bool1 && bool2
                    boolResult(result)
                }

                6 -> {
                    println("Boolean OR (||)")
                    val (bool1, bool2) = askBooleans()
                    val result = bool1 || bool2
                    boolResult(result)
                }

                7 -> {
                    println("Boolean NOT (!)")

                    val bool = readln().toBooleanStrictOrNull()
                        ?: throw IllegalArgumentException("Error: boolean or nothing!")

                    val result = !bool
                    boolResult(result)
                }

                8 -> {
                    println("Left Shift (shl)")
                    print("Enter the number to shift: ")
                    val num = readln().toDoubleOrNull()
                        ?: throw IllegalArgumentException("Error: First number invalid")
                    print("Enter the number of positions to shift left: ")
                    val positions = readln().toIntOrNull()
                        ?: throw IllegalArgumentException("Error: Second number invalid")

                    displayResult(shiftDouble(num, positions, true))
                }

                9 -> {
                    println("Right Shift (shr)")
                    print("Enter the number to shift: ")
                    val num = readln().toDoubleOrNull()
                        ?: throw IllegalArgumentException("Error: First number invalid")
                    print("Enter the number of positions to right left: ")
                    val positions = readln().toIntOrNull()
                        ?: throw IllegalArgumentException("Error: Second number invalid")

                    displayResult(shiftDouble(num, positions, false))
                }

                else -> { println("Invalid choice!") }

            }

        }

        catch (e: Exception) { println("Error: ${e.message}") }

    }

}

fun askNumbers(): Pair<Double, Double> {
    print("Enter first number: ")
    val num1 = readln().toDoubleOrNull()
        ?: throw NumberFormatException("Invalid first number!")

    print("Enter second number: ")
    val num2 = readln().toDoubleOrNull()
        ?: throw NumberFormatException("Invalid second number!")

    return Pair(num1, num2)
}

fun askBooleans(): Pair<Boolean, Boolean> {
    print("Enter first boolean: ")
    val bool1 = readln().toBooleanStrictOrNull()
        ?: throw NumberFormatException("Invalid first boolean!")

    print("Enter second boolean: ")
    val bool2 = readln().toBooleanStrictOrNull()
        ?: throw NumberFormatException("Invalid second boolean!")

    return Pair(bool1, bool2)
}

fun boolResult(bool: Boolean) {
    if (bool) { displayResult(1.0) }
    else { displayResult(0.0) }
}

fun displayResult(result: Double) {
    println("\nResult:")
    println("Decimal     : ${"%.4f".format(result)}")
    println("Hexadecimal : 0x${result.toLong().toString(16)}")
    println("Boolean     : ${result != 0.0}")
    println(" ")
    println(" ---------- ")
}

fun shiftDouble(num1: Double, num2: Int, bool: Boolean): Double {
    // Convert the Double to its raw bit representation (64-bit integer)
    val longBits = java.lang.Double.doubleToRawLongBits(num1)

    // Declare shiftedBits outside the if-else block to ensure it can be returned
    val shiftedBits = if (bool) {
        // Perform the left shift operation on the 64-bit integer
        longBits shl num2
    } else {
        // Perform the right shift operation on the 64-bit integer
        longBits shr num2
    }

    // Convert the shifted bits back to a Double
    return java.lang.Double.longBitsToDouble(shiftedBits)
}