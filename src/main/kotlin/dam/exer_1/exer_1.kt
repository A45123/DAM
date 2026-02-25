package org.example.dam.exer_1

// Create and initialize an integer array with the first 50 perfect squares (1^2,2^2,...,50^2)
fun main() {

    // a) Using IntArray constructor
    val perfectSquares = IntArray(50) { i -> (i+1) * (i+1) }
    println(message= perfectSquares.contentToString())

    // b) Using a range and map()
    val range = 1..50
    val perfectSquaresMap = range.associateWith { it * it }
    println(message= perfectSquaresMap)

    // c) Using Array with constructor
    val perfectSquaresArray = Array(50) { i -> (i+1) * (i+1) }
    println(message= perfectSquares.joinToString(", "))

}