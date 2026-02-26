package org.example.dam.exer_3

/*
    A ball is dropped from a height of 100 meters. Each time it bounces, it reaches 60% of its previous height. Write a program using generateSequence to model the bounce heights,
    Filter to keep only bounces that:
        - reach at least 1 meter high
        - take the first 15 qualifying bounces

    Convert to a list, and print the heights rounded to 2 decimal places. Print the sequence.
 */
fun main() {
    // Generate the sequence of bounce heights
    val bounceHeights = generateSequence(100.0) { it * 0.6 }
        .takeWhile { it >= 1.0 } // Filter out values less than 1 meter
        .take(15) // Take only the first 15 bounces
        .map { "%.2f".format(it) } // Round to 2 decimal places

    println(bounceHeights.joinToString("   "))
}